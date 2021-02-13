package ru.javawebinar.topjava.repository.inmemory;

import org.slf4j.Logger;
import org.springframework.stereotype.Repository;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.repository.MealRepository;
import ru.javawebinar.topjava.util.DateTimeUtil;
import ru.javawebinar.topjava.util.MealsUtil;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.slf4j.LoggerFactory.getLogger;

@Repository
public class InMemoryMealRepository implements MealRepository
{
    private static final Logger log = getLogger(InMemoryMealRepository.class);

    private final Map<Integer, Map<Integer, Meal>> usersMealsMap = new ConcurrentHashMap<>();
    private final AtomicInteger counter = new AtomicInteger(0);

    {
        MealsUtil.meals.forEach(meal -> save(meal, InMemoryUserRepository.USER_ID));
        save(new Meal(LocalDateTime.now(), "Admin eating", 1000), InMemoryUserRepository.ADMIN_ID);
    }

    @Override
    public Meal save(Meal meal, int userId) {
        //Map<Integer, Meal> userMeals = usersMealsMap.getOrDefault(userId, new ConcurrentHashMap<>());
        Map<Integer, Meal> userMeals = usersMealsMap.computeIfAbsent(userId, ConcurrentHashMap::new);

        if (meal.isNew()) {
            meal.setId(counter.incrementAndGet());
            userMeals.put(meal.getId(), meal);
            //usersMealsMap.put(userId, userMeals);
            return meal;
        }
        // handle case: update, but not present in storage
        return userMeals.computeIfPresent(meal.getId(), (id, oldMeal) -> meal);
    }

    @Override
    public boolean delete(int id, int userId) {
        //not use this in Concurrent because while doing second operation map may be changed
        //Also ConcurrentHashMap can't have null as a key or a value, so get operation return null only if there aren't
        //key that you looks for
        //return usersMealsMap.containsKey(userId) && usersMealsMap.get(userId).remove(id) != null;
        Map<Integer, Meal> userMeals = usersMealsMap.get(userId);
        return userMeals != null && userMeals.remove(id) != null;
    }

    @Override
    public Meal get(int id, int userId) {
        //return usersMealsMap.containsKey(userId) ? usersMealsMap.get(userId).get(id) : null;
        Map<Integer, Meal> userMeals = usersMealsMap.get(userId);
        return userMeals != null ? userMeals.get(id) : null;
    }

    @Override
    public List<Meal> getAll(int userId) {
        return getFiltered(userId, meal -> true);
    }

    @Override
    public List<Meal> getBetween(LocalDateTime fromInclude, LocalDateTime toExclude, int userId) {
        return getFiltered(userId, meal -> DateTimeUtil.isBetweenHalfOpen(meal.getDateTime(), fromInclude, toExclude));
    }

    private List<Meal> getFiltered(int userId, Predicate<Meal> filterCondition) {
        Map<Integer, Meal> userMeals = usersMealsMap.get(userId);

        return userMeals == null ? Collections.emptyList() : userMeals.values().stream().filter(filterCondition)
                                                                      .sorted(Comparator.comparing(Meal::getDateTime)
                                                                                        .reversed())
                                                                      .collect(Collectors.toList());
    }
}