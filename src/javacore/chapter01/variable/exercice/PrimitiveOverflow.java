package javacore.chapter01.variable.exercice;

public class PrimitiveOverflow {
    public static void main(String[] args) {
        short hourSeconds = 3600;
        int daySeconds = 3600*24;
        int weekSeconds = daySeconds*7;
        int monthSeconds = daySeconds*30;
        int yearSeconds = daySeconds*365;
        System.out.println(weekSeconds);
        System.out.println(daySeconds);
        System.out.println(yearSeconds);

    }
}
