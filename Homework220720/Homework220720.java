package com.telran.berlin.homeworks.Homework220720;

public class Homework220720 {
    public static void main(String[] args) {
        System.out.println(addition(4, 5));
        System.out.println(subtraction(4, 5));
        System.out.println(multiplication(4, 5));
        System.out.println(eurToUsd(4));
        calories();
    }


    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double eurToUsd(double eur) {
        return eur * 1.02;
    }

    private static void calories() {
        int cal = 40;
        int d1 = 28;
        int d2 = 24;
        double result = (area(d1) - area(d2)) * cal;
        System.out.println(result);
    }

    private static double area(int d) {
        int r = d / 2;
        double area = 3.14 * r * r;
        return area;
    }

}
