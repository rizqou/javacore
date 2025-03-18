package javacore.chapter02.condition.exercice;

public class CoinChangerV1 {
    public static void main(String[] args) {

        // ===========================================
        // Valeurs de test à essayer :
        // - totalBill = 66, amountPaid = 100
        // - totalBill = 30, amountPaid = 30  (rendu = 0)
        // - totalBill = 42, amountPaid = 50
        // - totalBill = 99, amountPaid = 100
        // - totalBill = 1, amountPaid = 100
        // - totalBill = 120, amountPaid = 200
        // ===========================================

        int totalBill  = 763;   // Montant total de la facture
        int amountPaid = 10000;  // Montant payé par le client

        // Calcul du montant à rendre
        int change = amountPaid - totalBill;

        System.out.println("Facture : " + totalBill + " €");
        System.out.println("Payé : " + amountPaid + " €");

        // Si le change est négatif, c'est que le client n'a pas assez payé
        if (change < 0) {
            System.out.println("Le client n'a pas payé assez. Il manque " + Math.abs(change) + " €.");
            return; // on arrête le programme
        }

        // Si le change est 0, pas de monnaie à rendre
        if (change == 0) {
            System.out.println("Aucune monnaie à rendre.");
            return;
        }

        System.out.println("Montant à rendre : " + change + " €");

        // ===========================================
        // Décomposition du rendu (grandes coupures -> petites)
        // ===========================================

        // Billets de 50€
        int billet50 = change / 50;      // Combien de billets de 50
        change = change % 50;           // On met à jour le "reste" à rendre

        // Billets de 20€
        int billet20 = change / 20;
        change = change % 20;

        // Billets de 10€
        int billet10 = change / 10;
        change = change % 10;

        // Pièces de 2€
        int piece2 = change / 2;
        change = change % 2;

        // Pièces de 1€
        int piece1 = change;  // Le reste est forcément inférieur à 2

        // ===========================================
        // Affichage du détail
        // (On peut choisir de n'afficher que ceux non-nuls)
        // ===========================================

        if (billet50 > 0) {
            System.out.println("Billets de 50€ : " + billet50);
        }
        if (billet20 > 0) {
            System.out.println("Billets de 20€ : " + billet20);
        }
        if (billet10 > 0) {
            System.out.println("Billets de 10€ : " + billet10);
        }
        if (piece2 > 0) {
            System.out.println("Pièces de 2€ : " + piece2);
        }
        if (piece1 > 0) {
            System.out.println("Pièces de 1€ : " + piece1);
        }
    }
}
