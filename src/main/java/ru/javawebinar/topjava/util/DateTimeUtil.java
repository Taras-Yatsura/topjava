package ru.javawebinar.topjava.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil
{
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    /*public static boolean isBetweenHalfOpen(LocalTime lt, LocalTime startTime, LocalTime endTime)
    {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) < 0;
    }*/

    public static LocalDateTime getBorderDateTime(LocalDate date, boolean isLowerBorder) {
        if (isLowerBorder) {
            return date == null ? LocalDateTime.MIN : date.atStartOfDay();
        }
        else {
            return date == null ? LocalDateTime.MAX : date.atStartOfDay().plusDays(1);
        }
    }

    public static <T extends Comparable<T>> boolean isBetweenHalfOpen(T value, T fromInclude, T toExclude) {
        return (fromInclude == null || value.compareTo(fromInclude) >= 0) &&
               (toExclude == null || value.compareTo(toExclude) < 0);
    }

    public static String toString(LocalDateTime ldt) {
        return ldt == null ? "" : ldt.format(DATE_TIME_FORMATTER);
    }
}

