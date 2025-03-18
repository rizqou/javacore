package javacore.chapter03.loop.exercice;

public class FibonnacciCalculator {
    public static void main(String[] args) {
        int suite = 0;
        // F(N) = F(N-1) + F(N-2)
        for (int i = 2; i <= 50; i++) {
        suite = (i-1) + (i - 2);
        System.out.println(suite);
        }
    }
}//0,1,1,2,3,5,8,13
// 2 et 3 = 5  3 et 5 = 8
