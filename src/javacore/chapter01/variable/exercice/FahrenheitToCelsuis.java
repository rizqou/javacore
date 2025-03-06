package javacore.chapter01.variable.exercice;

import java.util.Scanner;

public class FahrenheitToCelsuis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = fahrenheit - 32;
        System.out.println("Celsius: " + celsius);
    }
}
