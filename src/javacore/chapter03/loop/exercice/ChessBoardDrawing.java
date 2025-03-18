package javacore.chapter03.loop.exercice;

public class ChessBoardDrawing {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }

                // Ajout d'un espace entre les symboles
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}


