package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * adds and multiplies n first integers
 *
  */

public class AddMullApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("please insert a num");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            result = result * i;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Result: " + result);
        System.out.printf("Mul: %,d", result);
    }
}
