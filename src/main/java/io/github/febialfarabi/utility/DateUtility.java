package io.github.febialfarabi.utility;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {

    public static long dayDifferrence(@NotNull Date firstDate, @NotNull Date secondDate){
        //in milliseconds
        long diff = secondDate.getTime() - firstDate.getTime();


        long diffDays = diff / (24 * 60 * 60 * 1000);
        return diffDays;
    }

    public static long calculateAge(Date birthdate){
        if(birthdate==null){
            return 0l;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthdate);
        LocalDate start = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        LocalDate end = LocalDate.now();
        long years = ChronoUnit.YEARS.between(start, end);
        return years ;
    }

    public static Date startOfDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        return calendar.getTime();
    }
    public static Date endOfDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MILLISECOND, 999);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        return calendar.getTime();
    }

    public static Date currentDate(){
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    public static Date firstDayOfcurrentMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.MILLISECOND, 1);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        return calendar.getTime();
    }


    public static Date lastDayOfPreviousMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);

        int max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, max);

        return calendar.getTime();    }

    public static Date firstDayOfPreviousMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);

        int max = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, max);

        return calendar.getTime();
    }





}
