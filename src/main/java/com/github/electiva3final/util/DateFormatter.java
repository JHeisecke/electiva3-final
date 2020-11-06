package com.github.electiva3final.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static String DATE_FORMAT_INPUT = "dd/MM/yyyy";

    public static LocalDate convertToDateTime(String dateStr) {
        return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern(DATE_FORMAT_INPUT));
    }
}
