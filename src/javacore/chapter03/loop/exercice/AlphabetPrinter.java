package javacore.chapter03.loop.exercice;

public class AlphabetPrinter {
    public static void main(String[] args) {
        char letter = 'A';
        int counter = 1;
        while (counter <= 26) {
            System.out.println(letter++);
            counter++;
        }
    }
}
