package javacore.chapter02.condition.exercice;

import java.util.Scanner;

public class SmartHomeSecurity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the house empty? 1 for true and 0 for false");
        int inputEmptyHouse = sc.nextInt();
        boolean isHouseEmpty = (inputEmptyHouse == 1);

        System.out.println("Is the owner asleep? 1 for true and 0 for false");
        int inputOwnerIsAsleep = sc.nextInt();
        boolean isOwnerAsleep = (inputOwnerIsAsleep == 1);

        System.out.println("Are all doors and windows closed? 1 for true and 0 for false");
        int inputAreAllDoorsAndWindowsClosed = sc.nextInt();
        boolean areAllDoorsAndWindowsClosed = (inputAreAllDoorsAndWindowsClosed == 1);

        System.out.println("Are the alarms  activated? 1 for true and 0 for false");
        int inputAlarmIsActivated = sc.nextInt();
        boolean isAlarmActivated = (inputAlarmIsActivated == 1);
        boolean isSafeModeActivated;

         if((isHouseEmpty || isOwnerAsleep  && areAllDoorsAndWindowsClosed) && isAlarmActivated ) {
             isSafeModeActivated = true;
             System.out.println("Is safemode  activated ? " + isSafeModeActivated);
         }
         else {
             isSafeModeActivated = false;
             System.out.println("Is safemode activated ? " + isSafeModeActivated);
         }
    }
}
