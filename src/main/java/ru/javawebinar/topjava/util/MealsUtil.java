package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.MealTo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MealsUtil
{
    /*public static void main(String[] args)
    {
        List<Meal> meals = Arrays.asList(new Meal(LocalDateTime.of(2020, Month.JANUARY, 30, 10, 0), "Завтрак", 500),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 30, 13, 0), "Обед", 1000),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 30, 20, 0), "Ужин", 500),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 0, 0),
                                                  "Еда на граничное значение", 100),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 10, 0), "Завтрак", 1000),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 13, 0), "Обед", 500),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 20, 0), "Ужин", 410));

        List<MealTo> mealsTo = filteredByCycles(meals, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000);
        mealsTo.forEach(System.out::println);

        //        System.out.println(filteredByStreams(meals, LocalTime.of(7, 0), LocalTime.of(12, 0), 2000));
    }*/

    private static final int dayCalories = 2000;

    public static List<MealTo> initTransferList()
    {
        List<Meal> meals = Arrays.asList(new Meal(LocalDateTime.of(2020, Month.JANUARY, 30, 10, 0), "Завтрак", 500),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 30, 13, 0), "Обед", 1000),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 30, 20, 0), "Ужин", 500),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 0, 0),
                                                  "Еда на граничное значение", 100),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 10, 0), "Завтрак", 1000),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 13, 0), "Обед", 500),
                                         new Meal(LocalDateTime.of(2020, Month.JANUARY, 31, 20, 0), "Ужин", 410));

        return getFilteredList(meals, LocalTime.of(7, 0), LocalTime.of(12, 0), dayCalories);
    }

    public static List<MealTo> getFilteredList(List<Meal> meals, LocalTime startTime, LocalTime endTime,
                                               int caloriesPerDay)
    {
        Map<LocalDate, Integer> dayCalories =
                meals.stream().collect(Collectors.groupingBy(Meal::getDate, Collectors.summingInt(Meal::getCalories)));

        return meals.stream().filter(meal -> TimeUtil.isBetweenHalfOpen(meal.getTime(), startTime, endTime))
                    .map(meal -> createTrObj(meal, dayCalories.get(meal.getDate()) > caloriesPerDay))
                    .collect(Collectors.toList());
    }

    private static MealTo createTrObj(Meal meal, boolean isExcess)
    {
        return new MealTo(meal.getDateTime(), meal.getDescription(), meal.getCalories(), isExcess);
    }
}
