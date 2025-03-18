package javacore.chapter02.condition.exercice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MultiplicationTables {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the table: ");
        int table = input.nextInt();

        for (int i = 1; i <= table ; i++) {
            System.out.println("Table " + i + "*" + table + "=" + table * i );
        }
    }
}
