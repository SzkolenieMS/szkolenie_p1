package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-07.
 */
public class ZajecieCztery {

    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 0};
//        minFromArray(tablica);
//        maxFromArray(tablica);
//        avg(tablica);
//         revers(tablica);
        statistic(tablica);



    }

    public static void statistic (int[] array){
        System.out.println("Minimalna: " + minFromArray(array));
        System.out.println("Maksymalna: " + maxFromArray(array));
        System.out.println("Suma: " + sum(array));
        System.out.println("Srednia: " + avg(array));
        System.out.println("Rozpietosc: " + span(array));
        System.out.println("Odwrotnosc: ");
        revers(array);

    }

    public static void revers(int[] array){
        System.out.print("[");
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }

        }
        System.out.println("]");


    }

    public static void reversTable(int[] array){
        int temp =0;
        for (int i = 0; i < (array.length/2)+1 ; i++) {
//            System.out.println(i);
            temp = array[0+i];
             array[0+i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
    }

        public static int abs(int number) {
        if (number <0){
            number = number *-1; //number *= -1
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
        return sum(array)/(double)array.length;
    }


    public static int span(int[] array) {
        return maxFromArray(array) -minFromArray(array);
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
}
