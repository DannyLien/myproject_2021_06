package com.danny.coin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingTester {
    static List<Drinks> drinks = readDrinksFromeFile();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        int total = 0;
        while (n != 0) {
            System.out.print("Please insert coin : ");
            String s = scanner.next();
            n = Integer.parseInt(s);
            switch (n) {
                case 1:
                case 5:
                case 10:
                    total = total + n;
                    break;
                default:
                    if (n != 0) {
                        System.out.println("BEEP!");
                    }
                    break;
            }
            System.out.println("Total : " + total);
            for (Drinks drink : drinks) {
                System.out.println(drink);
            }
            System.out.println("-----------------------------");
        }
        System.out.println("End");
    }

    static List<Drinks> readDrinksFromeFile() {
        List<Drinks> drinks = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("drinks.txt"));
            String line = br.readLine();
            while (line != null) {
                String[] token = line.split(",");
                Drinks drink = new Drinks(token[0], token[1], Integer.parseInt(token[2]));
                drinks.add(drink);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drinks;
    }


}
