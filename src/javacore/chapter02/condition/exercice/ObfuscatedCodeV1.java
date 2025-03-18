package javacore.chapter02.condition.exercice;

public class ObfuscatedCodeV1 {
    public static void main(String[] args) {

        int b = 1; // Type de véhicule (1 = XXX, 2 = YYY, 3 = ZZZ)

        double a = 100; // Distance

        boolean e = true;
        double d = 0.03;

        double c = 0;

        if (b == 1) {
            c = a * 0.10;  // c = distance * 10/100 -> c = 10
        }
        if (b == 2) {
            c = a * 0.20;  // c = distance * 20/100 -> c = 20
        }
        if (b == 3) {
            c = a * 0.35;  // c = distance * 35/100 -> c = 35
        }
        if (e) {
            c = c - (a * d); // c = c - ( distance * 0.03)  -> c = 7
        } // c = distance * taux selon le type de véhicule puis 1 rabais de 3%
    }
}