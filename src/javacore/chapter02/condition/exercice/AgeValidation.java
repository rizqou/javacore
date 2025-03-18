package javacore.chapter02.condition.exercice;

import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {

        /**
         * Début d'un code que nous ne comprenons pas à ce stade de la formation...
         */

        // Récupération de la date courante de la machine exécutant ce programme
        java.time.LocalDate currentDate = java.time.LocalDate.now();

        int currentDay = currentDate.getDayOfMonth(); // Jour courant (entre 1 et 31)
        int currentMonth = currentDate.getMonthValue(); // Mois courant (entre 1 et 12)
        int currentYear = currentDate.getYear();       // Année courante (202X)

        System.out.println("Nous somme le " + currentDay + "/" + currentMonth + "/" + currentYear);

        Scanner input = new Scanner(System.in);
        System.out.println("Which day has you born ?");
        int dayBirth = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Which month has you born?");
        int monthBirth = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Which year has you born?");
        int yearBirth = input3.nextInt();

        if(currentYear - yearBirth == 18 && monthBirth >= currentMonth && dayBirth >= currentDay ) {
            System.out.println("Your are an adult");
        }
        else{
            System.out.println("You are not an adult");
        }
    }
}
