package javacore.chapter01.variable.exercice;

public class SalaryForecast {
    public static void main(String[] args) {
        // salaire brut - 23% ou 25%
        // impot revenu -10.5%
        // dev taux horaire = 25
        float salaireBrut = (25.00f * 38.50f)*4.00f;
        float salaireAnnuel = salaireBrut * 12.00f;
        float salaireNetImposable = salaireBrut * 0.75f;
        float salaireNetImposableAnnuel = salaireNetImposable * 12.00f;
        float salaireNetApresImpot = salaireNetImposable * 0.895f;
        float salaireNetApresImpotAnnuel = salaireNetApresImpot * 12.00f;
        System.out.println("salaire brut mensuel:" + salaireBrut);
        System.out.println("salaire brut annuel :" + salaireAnnuel);
        System.out.println("salaire net imposable mensuel:" + salaireNetImposable);
        System.out.println("salaire net imposable annuel:" + salaireNetImposableAnnuel);
        System.out.println("salaire net apres impot mensuel:" + salaireNetApresImpot);
        System.out.println("salaire net apres impotAnnuel:" + salaireNetApresImpotAnnuel);
        }
}
