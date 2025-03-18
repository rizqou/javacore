package javacore.chapter03.loop.exercice;

import java.util.Scanner;

public class PrimeNumberSearcher {
    public static void main(String[] args) {
        // 12, 16, 50, 103


        /*
        while (number % divisor != 0) {
            divisor++;
        }
        if (divisor == 41) {
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println( number + " is not a prime number");
        }

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for checking prime number: ");
        int number = input.nextInt();
        int divisor = 2;

        for(divisor = 2; divisor <= number; divisor++) {

            if (divisor == number) {
                System.out.println(number + " is a prime number");
            }
            else {
                System.out.println(number + " is not a prime number");
            }
        }

    }
}

