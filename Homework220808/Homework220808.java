package com.telran.berlin.homeworks.Homework220808;

import java.util.Scanner;

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
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter Nummber 1: ");
        int num1 = sc4.nextInt();
        System.out.println("Enter Nummber 2: ");
        int num2 = sc4.nextInt();
        System.out.println("Enter Nummber 3: ");
        int num3 = sc4.nextInt();
        System.out.println("Maximum of three numbers: " + checkNumber(num1, num2, num3));

        // 5:
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = sc5.nextInt();
        System.out.println("Enter limit: ");
        int limit = sc5.nextInt();
        System.out.println("This film allowed for the person: " + cinema(age, limit));

        //6:
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = sc6.nextInt();
        System.out.println("The year is leap: " + leapYear(year));
    }


    public static boolean supermarket(boolean edeka, boolean rewe) {
        return edeka || rewe;
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
        return year % 4 == 0 && year % 100 != 0 && year % 400 == 0;
    }
}
