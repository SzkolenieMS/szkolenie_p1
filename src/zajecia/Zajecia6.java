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
//        runAvgUntilMethod();
//        gamerMoreLessInitiate();
        System.out.println("Kroki: " +   gameBotMoreLess(15) );
    }

public static int BOT(int number, int lastnumber){
        Random random = new Random();
        int randomik = 0;
        if (lastnumber < 0) lastnumber *= -1;
        if (lastnumber < 2) lastnumber+=20;
        if (number == 0 ){
             randomik = random.nextInt(lastnumber)+(100-lastnumber);
            System.out.println("Randomik: " + randomik);
            return randomik;

        }else
    {
        randomik = random.nextInt(100-lastnumber);
        System.out.println("Randomik: " + randomik);
        return randomik;

    }
//    System.out.println(lastnumber + "last");



}
    public static int gameBotMoreLess(int number){

        System.out.println("Moj number" + number);
        int kroki = 0;
        int lastnumber = 1;
        int usernumber = -1;
        int result = 0;
        while (number != usernumber){
            usernumber = BOT(result, lastnumber);
            lastnumber = usernumber;
            System.out.println("shot:" + usernumber);
            //if (usernumber > number) lastnumber;
            kroki++;
            if (usernumber > number) result = 1;
            if (usernumber < number) result = 0;
            if (usernumber>1001 || usernumber<-1000) break;
        }
        return kroki;
    }






    public static void gamerMoreLessInitiate(){

        Random random = new Random();
        int liczbakrokow = gameMoreLess(random.nextInt(100));
        System.out.println("Zrobiles to w " + liczbakrokow + " krokach ");


    }
    public static int gameMoreLess(int number){
       //number 0-100
        System.out.println("Moj number" + number);
        int kroki = 0;
        int usernumber = -1;
        Scanner scanner= new Scanner(System.in);
        while (number != usernumber){
            System.out.println("Podaj liczbe");
            usernumber = scanner.nextInt();
            if (usernumber > number) System.out.println("Za duza liczba");
            if (usernumber < number) System.out.println("Za mala liczba");
            System.out.println();
            System.out.println();
            kroki++;
        }
        return kroki;
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
        int arraysum = array[0];
        int i=1;
        int avg = 0;
        while(avg < sum && array.length > i){
            arraysum += array[i];
            avg = arraysum / i ;
            i++;
        }
        System.out.println("Average: "+ avg);
        return avg>=sum;

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
