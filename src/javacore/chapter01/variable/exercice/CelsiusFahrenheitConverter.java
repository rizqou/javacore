package javacore.chapter01.variable.exercice;

import java.util.Scanner;

public class CelsiusFahrenheitConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsuis: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}
