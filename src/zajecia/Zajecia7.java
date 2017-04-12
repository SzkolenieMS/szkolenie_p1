package zajecia;

import java.util.Random;

/**
 * Created by RENT on 2017-04-12.
 */
public class Zajecia7 {

    public static void main(String[] args) {
//    ZajecieCztery.displayArray(numberToArray(159));
//        int[] array = {1,2,3,4};
//        System.out.println("Number: " + arrayToNumber(array));
//        numberToBinary(18);
        //Zajecia5.getRandomArray(3)));
        printMatrix(fillWithRandomNumbers(3,3));

    }

    public static int[][] fillWithRandomNumbers(int rows, int columns){
        Random random = new Random();
        int firstRandom;
        int secondRandom;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                firstRandom = random.nextInt(100);
                secondRandom = random.nextInt(100);
                matrix[i][j] = firstRandom + secondRandom;
            }
        }
return matrix;
    }


    public static void saveToMatrixExample(int[][] matrix) {
        int rows = 2;
        int columns = 4;
         matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i + j;
            }
        }


    }


    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            System.out.print(" | ");

            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + ", ");

            }
            System.out.println("|");
        }


        }


    public static int arrayToNumber(int[] array) {
        int number = 0;
        int multiTen = 1;
        for (int i = 0; i < array.length; i++) {
            number += array[array.length - i - 1] * multiTen;
            multiTen *= 10;
        }
        return number;
    }


    public static int[] numberToArray(int number) {
        int size = countOfDigits(number);
        int[] array = new int[size];


        for (int i = 0; i < array.length; i++) {
            array[array.length - i - 1] = number % 10;
            number /= 10;
        }
        return array;
    }


    public static int countOfDigits(int number) {
        int count = 0;
        while (number > 0) {
            count += 1;
            number /= 10;
        }
        return count;


    }


    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;


    }


}
