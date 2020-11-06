package com.github.electiva3final.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatter {
    public static String DD_MM_YYYY = "dd/MM/yyyy";
    public static String YYYY_MM_DD_TIME = "yyyy-MM-dd'T'HH:mm:ss";

    public static LocalDate convertToDate(String dateStr) {
        return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern(DD_MM_YYYY));
    }
    public static LocalDateTime convertToDateTime(String dateStr) {
        return LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern(YYYY_MM_DD_TIME, Locale.US));
    }
}
