package com.smartcrowd.app.web.rest.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by RanaHasan
 */
public class DateResource {
    public static LocalDate getDateAsLocalDate(){
        Date dates = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        Date input = new Date();
        return input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    }

    public LocalDate covertDateAsLocalDate(String dateVal){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDate localDate = LocalDate.parse(dateVal, formatter);

        return localDate;
    }
}
