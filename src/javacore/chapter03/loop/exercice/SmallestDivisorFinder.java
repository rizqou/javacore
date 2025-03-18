package javacore.chapter03.loop.exercice;

public class SmallestDivisorFinder {
    public static void main(String[] args) {
        // 12, 16, 50, 103
        int number = 39;
        int divisor = 2;
        while (number % divisor != 0) {
            divisor++;
        }
        if (divisor == 37) {
            System.out.println(number + " is a first number");
        }
        else{
            System.out.println("The smallest divisor of " + number + " is " + divisor);
        }
    }
}
