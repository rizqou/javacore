package javacore.chapter03.loop.exercice;

import java.util.Scanner;

public class PerfectNumberFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for perfect number Check: ");
        int number = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (sum == number) {
                    System.out.println(number + " is a perfect number");
                }

            }
        }
    }
}
