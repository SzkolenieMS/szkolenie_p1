package zajecia;

import jdk.nashorn.internal.objects.Global;

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

//        Random random = new Random();
//        int zmienna = random.nextInt(100);
//        System.out.println("Kroki: " +   gameBotMoreLess(zmienna) );
//        System.out.println(zmienna);

        System.out.println("Srednia ilosc krokow na sto gier = " +stoGier()/10000);
    }
    //30
    //7

    public static int stoGier(){
int suma = 0;
int krokow = 0;
        for (int i = 0; i < 10000; i++) {


            Random random = new Random();
            int zmienna = random.nextInt(100);
            krokow = gameBotMoreLess(zmienna);
            suma += krokow;
        }
        return suma;
    }


public static int[] BOT(int number, int lastnumber, int mniejszanajwieksza, int[] tablicawynikow, int kroki){
        Random random = new Random();
        int randomik = 0;
        int[] tablica ={0,0};
        int j = 0;
        boolean truefalse = true;
       // if (lastnumber < 0) lastnumber *= -1;
       // if (lastnumber < 2) lastnumber+=20;
    while (truefalse){
//        j++;
        truefalse = false;
        if (number == 0 ){
            tablica[0] = random.nextInt(mniejszanajwieksza-lastnumber)+lastnumber;
            tablica[1]= mniejszanajwieksza;
//            System.out.println("Randomik bo za male: " + tablica[0] + " last " + lastnumber + " mniej " + mniejszanajwieksza);


        }else
    {
        if (lastnumber < mniejszanajwieksza) tablica[1]= lastnumber;
        tablica[0] = random.nextInt(lastnumber);
                //+(100-lastnumber);

//        System.out.println("Randomik bo za duze: " + tablica[0]);

    }
        for (int i = 0; i <tablicawynikow.length-1 ; i++) {
            if (tablicawynikow[i] == tablica[0] && tablica[0] != 0) {
                truefalse = true;
            }
        }
//    if (j>20) break;
    }

    tablicawynikow[kroki] = tablica[0];
    return tablica;
//    System.out.println(lastnumber + "last");



}
    public static int gameBotMoreLess(int number){

//        System.out.println("Moj number" + number);
        int kroki = 0;
        int lastnumber = 1;
        int usernumber = -1;
        int[] tablicawynikow = new int[50];
        int[] tabelka ;
        int result = 0;
        int mniejszanajwieksza = 100+1;
        while (number != usernumber){
            tabelka = BOT(result, lastnumber, mniejszanajwieksza,tablicawynikow, kroki);
            usernumber = tabelka[0];
            lastnumber = usernumber;
            mniejszanajwieksza = tabelka[1];
//            System.out.println("shot:" + usernumber);
            //if (usernumber > number) lastnumber;
            kroki++;
            if (usernumber > number) result = 1;
            if (usernumber < number) result = 0;
            if (usernumber>1001 || usernumber<-1000) break;
            if (kroki> 100) break;
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
//        int suma = random.nextInt(1)+10;
//
        int suma = random.nextInt(85)+15;

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
