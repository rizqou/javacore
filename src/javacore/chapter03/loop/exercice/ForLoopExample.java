package javacore.chapter03.loop.exercice;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 2; i <= 20; i+=2) {
            System.out.println(i);
        }



        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }
        int factorial = 9;
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + factorial + " is " +result);

    }
}
