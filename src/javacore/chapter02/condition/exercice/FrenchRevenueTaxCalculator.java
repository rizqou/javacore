package javacore.chapter02.condition.exercice;

import java.util.Scanner;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args) {

        // 1) Préparation de la saisie utilisateur
        Scanner input = new Scanner(System.in);

        // 2) Lecture du salaire brut
        System.out.println("Veuillez entrer le salaire brut : ");
        double brutSalary = input.nextDouble();

        // 3) Lecture du type d'employé
        System.out.println("Veuillez entrer le type d'employé : ");
        System.out.println("   1 pour CADRE (cotisation 25%)");
        System.out.println("   2 pour OUVRIER (cotisation 23%)");
        int employeeType = input.nextInt();

        // 4) Calcul du salaire NET IMPOSABLE en fonction du type
        double netImposable;
        if (employeeType == 1) {
            // Cadre -> 25 % de cotisations
            netImposable = brutSalary * 0.75;
        } else if (employeeType == 2) {
            // Ouvrier -> 23 % de cotisations
            netImposable = brutSalary * 0.77;
        } else {
            // Type invalide
            System.out.println("Type d'employé invalide. Fin du programme.");
            return;  // On quitte le main
        }

        // 5) Affichage du salaire net imposable calculé
        System.out.println("Salaire net imposable : " + netImposable + " €");

        /*
         * 6) Calcul progressif de l'Impôt sur le Revenu (IR)
         * Tranches (simplifiées) :
         *  -  0 € à 11 294 €    : 0%
         *  - 11 295 € à 28 797 €: 11%
         *  - 28 798 € à 82 341 €: 30%
         *  - 82 342 € à 177 106 €: 41%
         *  - plus de 177 106 €  : 45%
         */
        double taxable = netImposable; // Salaire sur lequel on applique les tranches
        double totalTax = 0.0;

        // Si le salaire est en dessous du premier seuil, impôt = 0
        if (taxable <= 11294) {
            totalTax = 0.0;

        } else {
            // TRANCHE 2: 11 295 - 28 797 (taux 11%)
            double trancheStart = 11295;
            double trancheEnd = 28797;
            if (taxable > trancheStart) {
                double amountInThisTranche = Math.min(taxable, trancheEnd) - trancheStart;
                totalTax += amountInThisTranche * 0.11;
            }

            // TRANCHE 3: 28 798 - 82 341 (taux 30%)
            trancheStart = 28798;
            trancheEnd = 82341;
            if (taxable > 28797) {
                double amountInThisTranche = Math.min(taxable, trancheEnd) - trancheStart;
                totalTax += amountInThisTranche * 0.30;
            }

            // TRANCHE 4: 82 342 - 177 106 (taux 41%)
            trancheStart = 82342;
            trancheEnd = 177106;
            if (taxable > 82341) {
                double amountInThisTranche = Math.min(taxable, trancheEnd) - trancheStart;
                totalTax += amountInThisTranche * 0.41;
            }

            // TRANCHE 5: au-delà de 177 106 (taux 45%)
            trancheStart = 177107;
            if (taxable > 177106) {
                double amountInThisTranche = taxable - trancheStart + 1;
                totalTax += amountInThisTranche * 0.45;
            }
        }

        // 7) Affichage du montant total d'impôt
        System.out.println("Montant total de l'impôt sur le revenu : " + totalTax + " €");

        // 8) Calcul et affichage du salaire net APRÈS IR
        double netAfterIR = netImposable - totalTax;
        System.out.println("Salaire net après impôt sur le revenu : " + netAfterIR + " €");

        // 9) Calcul et affichage du taux effectif d'imposition
        // (Par rapport au net imposable)
        double effectiveRate = (totalTax / netImposable) * 100;
        System.out.println("Taux d'imposition effectif : " + effectiveRate + " %");

        input.close();
    }
}
