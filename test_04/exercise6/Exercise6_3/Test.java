package test_04.exercise6.Exercise6_3;

import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println("Before set time in millis");
        Print(gregorianCalendar);
        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.println("After set time in millis");
        Print(gregorianCalendar);
    }

    public static void Print(GregorianCalendar gregorianCalendar) {
        System.out.println("year: " + gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("month: " + gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println("day: " + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
