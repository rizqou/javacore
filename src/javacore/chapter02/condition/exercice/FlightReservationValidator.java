package javacore.chapter02.condition.exercice;

public class FlightReservationValidator {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        int age = 18;
        int seatsAvailable =10;

        if (age < 18) {

            System.out.println("Impossible to reserve that flight because you are a minor");
        }
        else if (!isLoggedIn) {

            System.out.println("Impossible to reserve that flight! Please log in first");
        }
        else if (seatsAvailable <= 0) {

            System.out.println("Impossible to reserve that flight! The flight is full");
        }
        else {

            System.out.println("That flight is reserved for you");
        }
    }
}
