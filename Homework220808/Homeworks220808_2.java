package com.telran.berlin.homeworks.Homework220808;

import java.util.Scanner;

public class Homeworks220808_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Students: ");
        int max = sc.nextInt();

        System.out.println("entrance: " + max);
//        int result = (int) (Math.random() * max + 1);
//        if (result == 1) result = 2;
        int min = 2;
        int result = (int) (min + Math.random() * ((max - min) + 1));
        System.out.println("We make a choice in the range 2 - " + max);
        System.out.println("exit " + result);
    }

}
