package javacore.chapter02.condition.exercice;

public class NumberComparison {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;

        if (number1 > number2) {
            System.out.println(number1 + " est plus grand que " + number2);
        } else if (number1 < number2) {
            System.out.println(number2 + " est plus grand que " + number1);
        } else {
            System.out.println("Les deux nombres sont égaux");
        }
    }
}
