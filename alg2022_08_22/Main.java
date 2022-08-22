package com.telran.berlin.homeworks.alg2022_08_22;

import com.telran.berlin.algorithms.lesson3_queue.Queue;

public class Main {
    public static void main(String[] args) {
//        Дан файл действительных чисел и два числа a и b.
//        Используя очередь (несколько очередей) напечатать сначала все элементы, меньшие a;
//        потом все элементы из отреза [a, b]; потом все элементы, большие b.
        double[] data = new double[7];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (100 * Math.random());
            System.out.println(data[i]);
        }
        System.out.println();
        int a = 30;
        int b = 70;
        Queue queue1 = new Queue();
        Queue queue2 = new Queue();
        for (int i = 0; i < data.length; i++) {
            if (data[i] < a) {
                System.out.println(data[i]);
            } else if (data[i] >= a && data[i] <= b){
                queue1.add(data[i]);
            } else {
                queue2.add(data[i]);
            }
        }
        while (!queue1.isEmpty()) {
            System.out.println(queue1.delete());
        }
        while (!queue2.isEmpty()) {
            System.out.println(queue2.delete());
        }
    }
}

