package com.telran.berlin.homeworks.Homework220808;

public class Homework220808 {
    public static void main(String[] args) {
        // 1:
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = false;

        if (isWeekend && !isRain) canWalk = true;
         System.out.println(canWalk);

        // 2:
        boolean isEdekaOpen = true;
        boolean isReweOpen = true;
        System.out.println(supermarket(isEdekaOpen, isReweOpen));

        // 3:
        int temperature1 = 101;
        int temperature2 = 99;
        System.out.println(deviceTest(temperature1, temperature2));

       // 4:
        System.out.println(checkNumber(6,7,12));

        // 5:
        System.out.println(cinema(12,12));

        //6:  I dont now;
        System.out.println(leapYear(2020));
    }


    public static boolean supermarket(boolean edeka, boolean rewe) {
        return edeka && rewe;
    }

    public static boolean deviceTest(int one, int second) {
        return (one > 100 && second < 100);
    }

    public static int checkNumber(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }
    public static boolean cinema(int age, int limit) {
       return age >= limit;
    }
    public static boolean leapYear(int year) {
        return year % 4 == 0;
    }
}
