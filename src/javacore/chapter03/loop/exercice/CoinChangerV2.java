package javacore.chapter03.loop.exercice;

public class CoinChangerV2 {
    public static void main(String[] args) {
        int change = 89; // l'argent à remettre au client
        int billet50 = 50;
        int reste = 0;
        for (int i = billet50; i <= change; i++) {
                if (i == change) {
                    System.out.println("Il y'a " + change/billet50 + " x 50 euros dans " + change+ " euros");
                    reste = change % 50;
                }

        }
        int billet20 = 20;
        change = reste;
        int reste1 = 0;
        for(int i = billet20; i <= change; i++) {
            if (i == change) {
                System.out.println("Il y'a " + change/billet20 + " x 20 euros dans " + change+ " euros");
                reste1 = change % 20;
            }
        }
        int billet10 = 10;
        change = reste1;
        int reste2 = 0;
        for(int i = billet10; i <= change; i++) {
            if (i == change) {
                System.out.println("Il y'a " + change/billet10 + " x 10 euros dans " + change+ " euros");
                reste2 = change % 10;
            }
        }
        int billet5 = 5;
        change = reste2;
        int reste3 = 0;
        for(int i = billet5; i <= change; i++) {
            if (i == change) {
                System.out.println("Il y'a " + change/billet5 + " x 5 euros dans " + change+ " euros");
                reste3 = change % 5;
            }
        }
        int piece2 = 2;
        change = reste3;
        int reste4 = 0;
        for(int i = piece2; i <= change; i++) {
            if (i == change) {
                System.out.println("Il y'a " + change/piece2 + " x 2 euros dans " + change+ " euros");
                reste4 = change % 2;
            }
        }
        int piece1 = reste4;
        System.out.println("Il y'a " + piece1 + " x 1 euros dans " + piece1 + " euros");
    }
}
