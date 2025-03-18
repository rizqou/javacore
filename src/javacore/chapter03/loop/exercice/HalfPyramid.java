package javacore.chapter03.loop.exercice;

public class HalfPyramid {
    public static void main(String[] args) {
        int numberOfRows = 3;

        for (int row = 1; row <= numberOfRows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
