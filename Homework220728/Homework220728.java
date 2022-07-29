package com.telran.berlin.homeworks.Homework220728;

public class Homework220728 {
    public static void main(String[] args) {
        level2_1("abcd");
        level2_2("abcd");
    }

    public static String level2_1(String input) {
        String result = input.substring(1) + input.substring(0, 1);
        System.out.println(result);
        return result;
    }

    public static String level2_2(String input) {
        String result = input.substring(input.length() - 1) + input.substring(0, input.length() - 1);
        System.out.println(result);
        return result;
    }
}
