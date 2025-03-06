package javacore.chapter02.condition.exercice;

import java.util.Objects;
import java.util.Scanner;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the  brut salary");
        double salary = input.nextDouble();

        System.out.println("Please enter the employee type: 1 for manager and 2 for worker ");
        String employeeType = input.next();

        if(Objects.equals(employeeType, "1")){
            salary = salary * 0.75;
        }
        else if(Objects.equals(employeeType, "2")){
            salary = salary * 0.77;
        }
        else{
            System.out.println("Please enter a valid employee type");
        }
        double salaryAfterFirstTax = salary;
        System.out.println("Net Taxable salary is " + salary);


        double taxableSalary1 = salary -11294;
        double taxableSalary2 = taxableSalary1 - 28797;
        double taxableSalary3 = taxableSalary2 - 82341;
        double taxableSalary4 = taxableSalary3 - 177106;
        double taxableSalary5 = taxableSalary4 * 0.55;


        if(taxableSalary1 < 28797){
            double finalSalary = (taxableSalary1 * 0.89) + 11294;
            System.out.println("Your Net salary after all taxes is " + finalSalary);
        }
        else if(taxableSalary2 < 82341){
           double finalSalary = (taxableSalary1 * 0.89) + 11294 + (taxableSalary2 * 0.70);
        }
        else if(taxableSalary3 < 177106){
            double finalSalary = (taxableSalary1 * 0.89) + 11294 + (taxableSalary2 * 0.70) +(taxableSalary3 * 0.59);
        }
        else if(taxableSalary4 > 177106) {
            double finalSalary = (taxableSalary1 * 0.89) + 11294 + (taxableSalary2 * 0.70) +(taxableSalary3 * 0.59) +(taxableSalary4 * 0.55);
        }
        else {
            System.out.println("Your Net salary after all taxes is " + salaryAfterFirstTax);
        }



    }
}
