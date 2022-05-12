package com.danny.coin;

import java.util.Scanner;

public class VendingTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        int total = 0;
        while (n != 0) {
            System.out.print("Please insert coin : ");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                case 5:
                case 10:
                    total = total + n;
                    break;
                default:
                    if (n != 0){
                        System.out.println("BEEP!");
                    }
                    break;
            }
            System.out.println("Total : " + total);
        }
        System.out.println("End");
    }

}
