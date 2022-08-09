package com.telran.berlin.homeworks.Homework220808;

import java.util.Scanner;

public class Homeworks220808_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Students: ");
        int num = sc.nextInt();

        System.out.println("entrance: " + num);
        int result = (int) (Math.random() * num + 1);
        if (result == 1) result = 2;
        System.out.println("We make a choice in the range 2 - " + num);
        System.out.println("exit " + result);
    }
}
