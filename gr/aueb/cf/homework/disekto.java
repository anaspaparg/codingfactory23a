package gr.aueb.cf.homework;

import java.util.Scanner;

/**
 * checks if a year is disekto
 */
public class disekto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Please provide a year");
        year = in.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Το ετος ειναι δισεκτο");
        } else {
            System.out.println("Οχι δισεκτο");
        }
    }
}
