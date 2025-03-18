package javacore.chapter02.condition.exercice;

public class BasicStopwatch {
    public static void main(String[] args) throws InterruptedException {

        int i = 0;

        /*
         * Une boucle while qui itèrera 100x grâce à l'incrémentation de la variable i (à la fin de la boucle)
         */
        while(i < 100) {

            /*
             * Effectue une "pause" de 1000 millisecondes / 1 seconde
             */
            Thread.sleep(1000);
            int second =0;
            int minute =0;
            int hour =0;
            System.out.println(second + i +" seconds "+ minute +" minutes "+ hour +" hours");
                if(second >= 60) {
                    second = 0;
                    minute++;

                }
                if(minute >= 60) {
                    minute = 0;
                    hour++;
                }
                if(hour >= 24) {
                    hour = 0;
                }
            /*
             * Incrémente "i = i + 1;" pour atteindre la condition de la boucle while
             */
            i++;
        }

    }

}
