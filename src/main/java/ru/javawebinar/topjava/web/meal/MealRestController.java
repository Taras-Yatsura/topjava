package ru.javawebinar.topjava.web.meal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.service.MealService;
import ru.javawebinar.topjava.to.MealTo;
import ru.javawebinar.topjava.util.MealsUtil;
import ru.javawebinar.topjava.web.SecurityUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static ru.javawebinar.topjava.util.ValidationUtil.assureIdConsistent;

@Controller
public class MealRestController
{
    protected final Logger log = LoggerFactory.getLogger(getClass());
    private final MealService service;

    @Autowired
    public MealRestController(MealService service) {
        this.service = service;
    }

    public Meal get(int id) {
        int userId = SecurityUtil.authUserId();
        log.info("get meal with id={} for user with id={}", id, userId);
        return service.get(id, userId);
    }

    public List<MealTo> getAll() {
        int userId = SecurityUtil.authUserId();
        log.info("show all meals for user with id={}", userId);
        return MealsUtil.getTos(service.getAll(userId), SecurityUtil.authUserCaloriesPerDay());
    }

    public List<MealTo> getBetween(LocalDate fromDateIncl, LocalTime fromTimeIncl, LocalDate toDateExcl,
                                   LocalTime toTimeExcl) {
        int userId = SecurityUtil.authUserId();
        log.info("get between ({} - {}) for dates ({} {}) for user with id={}", fromTimeIncl, toTimeExcl, fromDateIncl,
                 toDateExcl, userId);
        List<Meal> mealsBetweenDates = service.getBetween(fromDateIncl, toDateExcl, userId);
        return MealsUtil
                .getFilteredTos(mealsBetweenDates, SecurityUtil.authUserCaloriesPerDay(), fromTimeIncl, toTimeExcl);
    }

    public Meal create(Meal meal) {
        int userId = SecurityUtil.authUserId();
        log.info("create meal {} for user with id={}", meal, userId);
        return service.create(meal, userId);
    }

    public void update(Meal meal, int id) {
        int userId = SecurityUtil.authUserId();
        assureIdConsistent(meal, id);
        log.info("updating {} for user with id={}", meal, userId);
        service.update(meal, id);
    }

    public void delete(int id) {
        int userId = SecurityUtil.authUserId();
        log.info("delete meal with id={} of user with id={}", id, userId);
        service.delete(id, userId);
    }
}