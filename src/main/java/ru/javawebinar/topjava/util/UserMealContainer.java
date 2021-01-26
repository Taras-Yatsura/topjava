package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;

import java.util.List;

public class UserMealContainer
{
    private final List<UserMeal> dayList;
    private int caloriesLeft;

    public UserMealContainer(List<UserMeal> dayList, int caloriesLeft)
    {
        this.dayList = dayList;
        this.caloriesLeft = caloriesLeft;
    }

    public void add(UserMeal meal)
    {
        dayList.add(meal);
        this.caloriesLeft -= meal.getCalories();
    }

    public List<UserMeal> getDayList()
    {
        return dayList;
    }

    public int getCaloriesLeft()
    {
        return caloriesLeft;
    }
}
