package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εμφανιζει επαναληπτικα ενα μενου επιλογων μεχρι ο
 * χρηστησ να επιλεξει εξοδο
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("επιλεξτε ενα απο τα παρακατω");
            System.out.println("1. Εισαγωγη προιοντος");
            System.out.println("2. Διαγραφη προιοντος");
            System.out.println("3. Εξοδος");
            choice = in.nextInt();
        } while (choice != 3);
    }
}
