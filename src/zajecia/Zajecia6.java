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
        GrajacyBot(1000000);
    }

    public static void GrajacyBot(int ilegier) {
        int suma = 0;
        int krokow;
        for (int i = 0; i < ilegier; i++) {
            Random random = new Random();
            int zmienna = random.nextInt(100);
            krokow = gameBotMoreLess(zmienna);
            suma += krokow;
        }

        System.out.println("Srednia ilosc krokow na " + ilegier + " gier = " + (double) suma / ilegier);
    }


    public static int[] BOT(int result, int lastnumber, int mniejszanajwieksza, int[] tablicawynikow, int kroki, int wiekszamniejsza) {
        Random random = new Random();
        int[] tablica = {0, 0, 0};
        boolean truefalse = true;
//        System.out.println("Start - LastNumber " + lastnumber + " Mniejszawieksza: " + mniejszanajwieksza + " Wiekszamniejsza: " + wiekszamniejsza);
        while (truefalse) {
            truefalse = false;
            if (result == 0) {
                tablica[0] = random.nextInt(mniejszanajwieksza - lastnumber) + lastnumber;
//                System.out.println("mniejsze( "+ mniejszanajwieksza+  " - " + lastnumber + " ) +" + lastnumber);
                tablica[1] = mniejszanajwieksza;
                tablica[2] = lastnumber;


            } else {

                // if ((mniejszanajwieksza - wiekszamniejsza) == 0) mniejszanajwieksza += 1;
                tablica[0] = random.nextInt(lastnumber - wiekszamniejsza) + wiekszamniejsza;
//                System.out.println("wieksze(" + mniejszanajwieksza + " - " +wiekszamniejsza + " ) +" + wiekszamniejsza);
                tablica[1] = lastnumber;
                tablica[2] = wiekszamniejsza;

            }
            for (int i = 0; i < tablicawynikow.length - 1; i++) {
                if (tablicawynikow[i] == tablica[0] && tablica[0] != 0) {
                    truefalse = true;
                }
            }
        }
//        if (tablica[1] == 0) tablica[1] =1;
//        System.out.println("End - Random: " + tablica[0] + " Mniejszawieksza: " + tablica[1] + " Wiekszamniejsza: " + tablica[2]);
        tablicawynikow[kroki] = tablica[0];
        return tablica;


    }

    public static int gameBotMoreLess(int number) {
//        System.out.println("Number to search: " + number);
        Random random = new Random();
        int kroki = 0;
        int usernumber = random.nextInt(100);
        int lastnumber = usernumber;
        int[] tablicawynikow = new int[80];
        int[] tabelka;
        int result = 0;
        int mniejszanajwieksza = 100;
        int wiekszamniejsza = 0;
        while (number != usernumber) {
            if (usernumber > number) result = 1;
            if (usernumber < number) result = 0;
            tabelka = BOT(result, lastnumber, mniejszanajwieksza, tablicawynikow, kroki, wiekszamniejsza);
            usernumber = tabelka[0];
            lastnumber = usernumber;
            mniejszanajwieksza = tabelka[1];
            wiekszamniejsza = tabelka[2];
            kroki++;
        }
//        System.out.println("Kroki: " + kroki);
        return kroki;
    }


    public static void gamerMoreLessInitiate() {

        Random random = new Random();
        int liczbakrokow = gameMoreLess(random.nextInt(100));
        System.out.println("Zrobiles to w " + liczbakrokow + " krokach ");


    }

    public static int gameMoreLess(int number) {
        //number 0-100
        System.out.println("Moj number" + number);
        int kroki = 0;
        int usernumber = -1;
        Scanner scanner = new Scanner(System.in);
        while (number != usernumber) {
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


    public static void runAvgUntilMethod() {

        Random random = new Random();
        int[] array = Zajecia5.getRandomlowArray(random.nextInt(10) + 15);
        ZajecieCztery.displayArray(array);
//        int suma = random.nextInt(1)+10;
//
        int suma = random.nextInt(85) + 15;

        System.out.println("Liczba graniczna: " + suma);
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
