package javacore.chapter02.condition.exercice;

public class AgeBasedDiscount {
    public static void main(String[] args) {
        // 10, 25, 26, 64, 65
        int age = 25;
        // 50, 100
        double price = 50;

        if (age <= 25) {
            price *= 0.75;
        } else if (age >= 65) {
            price *= 0.25;
        }

        System.out.println("Prix final : " + price + "€");
    }
}
