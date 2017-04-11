package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-07.
 */
public class ZajecieCztery {

    public static void main(String[] args) {


//        int[] tablica = getArrayFromUser();
//        minFromArray(tablica);
//        maxFromArray(tablica);
//        avg(tablica);
//         revers(tablica);
//        statistic(tablica);
//        displayArray(tablica);
//        homework();
        lineOfNumbers(5);

    }

    public static void lineOfNumbers(int value){
        for (int i = 0; i <value -1 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            System.out.println(i+1);


        }



    }


    public static int[] getRandomArray(int size) {
        return getRandomArray(size, Integer.MAX_VALUE);
    }

    public static int[] getRandomArray(int size, int bound) {
        return getRandomArray(size, bound, 0);
    }

    public static int[] getRandomArray(int size, int bound, int offset) {

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + offset;
        }
        return array;
    }

    public static void homework() {
        Random random = new Random();
        int value = random.nextInt(10) + 15;
//        System.out.println(value);
        int[] tablica = getArray(value);
        statistic(tablica);

        // wywolac statisic
        //dla wylosowanej liczby -12 zrobi drzewko
    }


    public static void displayReversed(int[] array) {
        displayArray(reversTable(array));


    }

    public static void displayArray(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1)
                System.out.println(", ");
        }
        System.out.println("]");


    }


    public static int[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ilosc elementow: ");
        int ile = scanner.nextInt();
        int[] array = new int[ile];
        for (int i = 0; i < ile; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe");
            array[i] = scanner.nextInt();

        }
        return array;

    }


    public static void statistic(int[] array) {
        System.out.println("Minimalna: " + minFromArray(array));
        System.out.println("Maksymalna: " + maxFromArray(array));
        System.out.println("Suma: " + sum(array));
        System.out.println("Srednia: " + avg(array));
        System.out.println("Rozpietosc: " + span(array));
        System.out.println("Odwrotnosc: ");
        revers(array);

    }

    public static void revers(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }

        }
        System.out.println("]");


    }

    public static int[] reversTable(int[] array) {
        int temp = 0;
        for (int i = 0; i < (array.length / 2) + 1; i++) {
//            System.out.println(i);
            temp = array[0 + i];
            array[0 + i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;

    }

    public static int abs(int number) {
        if (number < 0) {
            number = number * -1; //number *= -1
        }
        return number;

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }


    public static double avg(int[] array) {
        return sum(array) / (double) array.length;
    }


    public static int span(int[] array) {
        return maxFromArray(array) - minFromArray(array);
    }


    public static int minFromArray(int[] array) {
        int najmniejszy = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < najmniejszy)
                najmniejszy = array[i];
        }

//        System.out.println("Najmniejsza wartosc: " + najmniejszy);
        return najmniejszy;
    }


    public static int maxFromArray(int[] array) {
        int najwiekszy = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > najwiekszy)
                najwiekszy = array[i];
        }

//        System.out.println("Najmniejsza wartosc: " + najwiekszy);
        return najwiekszy;


    }


    public static void displayDate(int day, int month, int year) {
        if (day > 0 && day < 32 && month > 0 && month < 13 && year > 0) {

            System.out.println("Dzien: " + day + ", Miesiac: " + month + ", Rok: " + year);

        } else {
            System.out.println("Niepoprawne dane");


        }


    }

    public static int[] getArray(int value) {
        int size = value / 2;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + value % 2;

        }
        return array;

    }


}
