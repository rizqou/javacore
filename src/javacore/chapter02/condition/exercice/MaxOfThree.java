package javacore.chapter02.condition.exercice;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greater than " + num2 + " and " + num3 + ".");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater than " + num1 + " and " + num3 + ".");
        }
        else{
            System.out.println(num3 + " is greater than " + num1 + " and " + num2 + ".");
        }
    }
}
