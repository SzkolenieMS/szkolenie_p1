package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-11.
 */
public class Zajecia6 {

    public static void main(String[] args) {

//        rememberWhile();
//        System.out.println("Podaj liczbe");
//    Scanner scanner = new Scanner(System.in);
//    printPowersOf2(scanner.nextInt());
        runAvgUntilMethod();
    }

    public static void runAvgUntilMethod(){

        Random random = new Random();
        int [] array = Zajecia5.getRandomlowArray(random.nextInt(10)+15);
        ZajecieCztery.displayArray(array);
        int suma = random.nextInt(1)+10;
        System.out.println("Liczba graniczna: " + suma);
        System.out.println(avgUntil(array,suma));



    }

    public static boolean avgUntil(int[] array, int sum){
        int arraysum = 0;
        int i=1;
        int avg = 0;
        while(avg < sum){
            if (array.length == i){
                System.out.println("Average: "+ avg);
                return false;
            }
            arraysum += array[i];
            avg = arraysum / i ;
            i++;
        }
        System.out.println("Average: "+ avg);
        return true;

    }

    public static void printPowersOf2(int number){
     int value = 1;
        while(value < number){
            System.out.println(value);
            value *= 2;

        }
    }

    public static boolean sumUntil(int[] array, int sum){
        int arraysum = 0;
        int i=0;
        while(arraysum < sum){
            if (array.length == i){
                return false;
            }
            arraysum += array[i];
            i++;

        }
        return true;

    }



    public static void rememberWhile(){
        int number = 10;
        int counter = 0;
        Random random = new Random();
        while (number>0) {
            counter++;
            number -= random.nextInt(3);
        }
        System.out.println(counter);

    }
}
