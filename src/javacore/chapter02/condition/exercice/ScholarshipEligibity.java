package javacore.chapter02.condition.exercice;

import java.util.Scanner;

public class ScholarshipEligibity {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your student GPA: ");
        double studentGpa = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your houseIncome: ");
        double houseIncome = input2.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Has you an extracurricular activity? 1 for true and 0 for false: ");
        int hasExtracurricular = input3.nextInt();
        boolean hasExtracurricular1 = hasExtracurricular == 1;

        if (studentGpa >= 3.5 && houseIncome < 40000 && hasExtracurricular1) {
            System.out.println("Full eligibility");
        } else if (studentGpa >= 3.5 && houseIncome < 60000 || !hasExtracurricular1) {
            System.out.println("Partial eligibility");
        }
        else {
            System.out.println("Not eligible");
        }
    }
}
