package com.telran.berlin.homeworks.lottery;

public class Lottery {
    public static void main(String[] args) {

        boolean myNumbers = isWin(23, 24, 44, 45, 32);
        if (myNumbers ) {
            System.out.println("You won");
        } else {
            System.out.println("Try another one");
        }
    }

    private static int getRandomWinNums() {
        return (int) (1 + Math.random() * ((50 - 1) + 1));
    }

    private static boolean isWin(int i1, int i2, int i3, int i4, int i5) {
        int win1 = getRandomWinNums();
        int win2 = getRandomWinNums();
        int win3 = getRandomWinNums();
        int win4 = getRandomWinNums();
        int win5 = getRandomWinNums();
        boolean result = false;
        if (i1 == win1 || i1 == win2 || i1 == win3 || i1 == win4 || i1 == win5) {
            result = true;
        } else if (i2 == win1 || i2 == win2 || i2 == win3 || i2 == win4 || i2 == win5) {
            result = true;
        } else if (i3 == win1 || i3 == win2 || i3 == win3 || i3 == win4 || i3 == win5) {
            result = true;
        } else if (i4 == win1 || i4 == win2 || i4 == win3 || i4 == win4 || i4 == win5) {
            result = true;
        } else if (i5 == win1 || i5 == win2 || i5 == win3 || i5 == win4 || i5 == win5) {
            result = true;
        }
        System.out.println("Winning numbers are: " + win1 + ", " + win2 + ", " + win3 + ", " + win4 + ", " + win5);
        return result;
    }


}
