package javacore.chapter03.loop.exercice;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int counter = 1;
        long factorial = 1;
        while (counter <= number ) {
            factorial = factorial * counter;
            counter++;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
