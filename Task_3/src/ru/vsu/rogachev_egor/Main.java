package ru.vsu.rogachev_egor;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void printColorForPoint(double x, double y) {
        System.out.println(Programm.getColor(x, y));
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        printColorForPoint(-8, 5);
        printColorForPoint(-1, 9);
        printColorForPoint(2, 4);
        printColorForPoint(1, 1);
        printColorForPoint(0, 1);
        printColorForPoint(4, -1);
        printColorForPoint(-2, 0);
        printColorForPoint(1, -6);
        printColorForPoint(-8, -4);
        printColorForPoint(-7, 1);

        System.out.println("Input x:");
        int x = scanner.nextInt();
        System.out.println("Input y:");
        int y = scanner.nextInt();
        System.out.println(Programm.getColor(x, y));
    }
}
