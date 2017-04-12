package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-11.
 */
public class Zajecia6 {

    public static void main(String[] args) {

        botsChalanage();

    }

public static void runBots(){

    long StartTime = System.currentTimeMillis();
    System.out.println("Average steps for " + 1000000 + " games = " + playMyBot(1000000));
    long EndTime = System.currentTimeMillis();
    System.out.println("Time of running my bot: " + ((double) (EndTime - StartTime) / 1000) + "sek");

    StartTime = System.currentTimeMillis();
    System.out.println("Average steps for " + 1000000 + " games = " + playWhileBot(1000000));
    EndTime = System.currentTimeMillis();
    System.out.println("Time of running While bot: " + ((double) (EndTime - StartTime) / 1000) + "sek");


}



    public static void botsChalanage(){
        double myBotSteps=0, whileBotSteps=0;
        for (int i = 0; i < 100; i++) {
            myBotSteps += playMyBot(100000);
            whileBotSteps += playWhileBot(100000);

        }

        System.out.println("Result of my bot: " + myBotSteps/1000);
        System.out.println("Result of while bot: " + whileBotSteps/1000);
    }


    public static int gameWhileMoreLess(int x) {
        int l, p, s;
        int steps = 0;
        int[] a = new int[100];
        for (int i=0; i<100; i++) {
            a[i] = i+1;
        }
        l = 0;
        p = 100 - 1;
        while (l <= p) {
            steps++;
            s = (l + p) / 2;
            if (a[s] == x) {
                return steps;
            }
            if (a[s] < x)
                l = s + 1;
            else
                p = s - 1;
        }
return steps;
    }


    public static double playWhileBot(int gameAmount){

        int sum = 0;
        int steps;
        int[] stepsCounter = new int[50];
        for (int i = 0; i < gameAmount; i++) {
            Random random = new Random();
            int amount = random.nextInt(100);
            steps = gameWhileMoreLess(amount);
            sum += steps;
            stepsCounter[steps] += 1;
        }



return ((double) sum / gameAmount);

    }



    public static double playMyBot(int gameAmount) {
        int sum = 0;
        int steps;
        int[] stepsCounter = new int[50];
        for (int i = 0; i < gameAmount; i++) {
            Random random = new Random();
            int amount = random.nextInt(100);
            steps = gameBotMoreLess(amount);
            sum += steps;
            stepsCounter[steps] += 1;
        }
        return ((double) sum / gameAmount);
    }


    public static int[] BOT(boolean result, int lastNumber, int lowerBigger, int[] tableOfResults, int steps, int biggerLower) {
        Random random = new Random();
        int[] table = {0, 0, 0};
        boolean trueFalse = true;
        while (trueFalse) {
            trueFalse = false;
            if (result == false) {
                table[0] = random.nextInt(lowerBigger - lastNumber) + lastNumber;
                table[1] = lowerBigger;
                table[2] = lastNumber;
            } else {
                table[0] = random.nextInt(lastNumber - biggerLower) + biggerLower;
                table[1] = lastNumber;
                table[2] = biggerLower;
            }
            for (int i = 0; i < tableOfResults.length - 1; i++) {
                if (tableOfResults[i] == table[0] && table[0] != 0) {
                    trueFalse = true;
                }
            }
        }
        tableOfResults[steps] = table[0];
        return table;
    }


    public static int gameBotMoreLess(int number) {
        Random random = new Random();
        int steps = 0;
        int lastNumber = 50;
        int[] tableOfResult = new int[80];
        int[] table;
        boolean result;
        int lowerBigger = 100;
        int biggerLower = 0;
        while (number != lastNumber) {
            if (lastNumber > number) {
                result = true;
            } else {
                result = false;
            }
            table = BOT(result, lastNumber, lowerBigger, tableOfResult, steps, biggerLower);
            lastNumber = table[0];
            lowerBigger = table[1];
            biggerLower = table[2];
            steps++;
        }

        return steps;
    }


    public static void gamerMoreLessInitiate() {

        Random random = new Random();
        int stepsCount = gameMoreLess(random.nextInt(100));
        System.out.println("You did it in " + stepsCount + " steps ");


    }

    public static int gameMoreLess(int number) {
        //number 0-100
        System.out.println("My number" + number);
        int steps = 0;
        int usernumber = -1;
        Scanner scanner = new Scanner(System.in);
        while (number != usernumber) {
            System.out.println("Give me number");
            usernumber = scanner.nextInt();
            if (usernumber > number) System.out.println("Too big");
            if (usernumber < number) System.out.println("Too low");
            System.out.println();
            System.out.println();
            steps++;
        }
        return steps;
    }


    public static void runAvgUntilMethod() {

        Random random = new Random();
        int[] array = Zajecia5.getRandomlowArray(random.nextInt(10) + 15);
        ZajecieCztery.displayArray(array);
//        int suma = random.nextInt(1)+10;
//
        int suma = random.nextInt(85) + 15;

        System.out.println("Sum: " + suma);
        System.out.println(avgUntil(array, suma));


    }

    public static boolean avgUntil(int[] array, int sum) {
        int arraysum = array[0];
        int i = 1;
        int avg = 0;
        while (avg < sum && array.length > i) {
            arraysum += array[i];
            avg = arraysum / i;
            i++;
        }
        System.out.println("Average: " + avg);
        return avg >= sum;

    }

    public static void printPowersOf2(int number) {
        int value = 1;
        while (value < number) {
            System.out.println(value);
            value *= 2;

        }
    }

    public static boolean sumUntil(int[] array, int sum) {
        int arraysum = 0;
        int i = 0;
        while (arraysum < sum) {
            if (array.length == i) {
                return false;
            }
            arraysum += array[i];
            i++;

        }
        return true;

    }


    public static void rememberWhile() {
        int number = 10;
        int counter = 0;
        Random random = new Random();
        while (number > 0) {
            counter++;
            number -= random.nextInt(3);
        }
        System.out.println(counter);

    }
}
