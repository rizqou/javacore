package javacore.chapter02.condition.exercice;

public class ConditionError {


    public static void main(String[] args) {

        int age = 80;

        if (age <= 16) {
            System.out.println("Vous êtes mineur.");
        } else if (age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        } else if (age == 18) {
            System.out.println("Vous êtes majeur.");
        } else if (age < 60) {
            System.out.println("Vous êtes un adulte.");
        } else if (age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        } else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }
        /* la condition age > 18 est trop générale, ce qui fait que le programme tombe et s'arrete à cette condition
        sans meme vérifier les conditions suivantes lorsqu'elles s'imposent. Ici la condition age < 60 suffit à verifier
        si l'age de l'utilisateur se trouve dans la tranche 18-60.
         */
    }
}