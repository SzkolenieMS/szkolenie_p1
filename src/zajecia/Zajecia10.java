package zajecia;

import java.util.Random;

/**
 * Created by RENT on 2017-04-20.
 */
public class Zajecia10 {
    public static void main(String[] args) {


//        System.out.println(find("qwertest1234123 test test", "test"));

//        int[] array= {1,2,3,4};
//        printStringStatistics(array);
//        multipyDigits(1234);




    }




    public static String toBinary(int number){
        String string = "";
        while (number > 0)
        {
            string =  ( (number % 2 ) == 0 ? "0" : "1") +string;
            number = number / 2;
        }
        return string;

    }

    public static int toNumber( String binaryCode){
        char[] numbers = binaryCode.toCharArray();
        int result = 0;
        for(int i=numbers.length - 1; i>=0; i--)
            if(numbers[i]=='1')
                result += Math.pow(2, (numbers.length-i - 1));
        return result;

    }

    //##FF0050 -> 255,0,80
    public static int[] rgbToValues(String rgb){

        int[] ret = new int[3];
        for (int i = 0; i < 3; i++)
        {
            ret[i] = Integer.parseInt(rgb.substring(i * 2, i * 2 + 2), 16);
        }
        return ret;

    }

    public static int[][] fillWithRandomNumbers(int size, int bounds,int offset){
        Random random = new Random();
        int firstRandom;
        int secondRandom;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                firstRandom = random.nextInt(bounds)+offset;
                secondRandom = random.nextInt(bounds)+offset;
                matrix[i][j] = firstRandom + secondRandom;
            }
        }
        return matrix;
    }



    public static double avg(int[][] matrix1) {
        double avg = 0;
        int counter = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                avg += matrix1[i][j];
                counter++;
            }
        }
        return avg / counter;

    }


    public static double[][] avg(int[][] matrix1, int[][] matrix2) {

        double[][] newMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                newMatrix[i][j] = (matrix1[i][j] * matrix2[i][j]) / 2;
            }
        }
        return newMatrix;

    }


    //123 = 1*2*3
    public static int multipyDigits(int numbers) {
        int sum = 1;
        int tmp;
        while (numbers > 0) {
            sum *= numbers % 10;
            numbers /= 10;
        }
        return sum;
    }

    public static int[] stringStatisic(String message) {
        char[] charArray = message.toCharArray();
        int[] intArray = new int[26];
        int temp;
        for (int i = 0; i < charArray.length; i++) {
            temp = toLowerCase(charArray[i]);
            if (temp >= 97 && temp <= 122) {
                intArray[temp - 97]++;
            }
        }
        return intArray;

    }

    public static void printStringStatistics(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print(((char) (i + 96)));

            }
        }
    }


    public static char toLowerCase(char a) {
        if (a >= 65 && a <= 90) {
            a += 32;
        }
        return a;
    }


    public static int find(String message, char sentence) {
        char[] charArray = message.toCharArray();
        int tmpI = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == sentence) {
                tmpI = i;
            }
        }
        return tmpI;
    }

    public static int countAll(String message, char sentence) {

        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == sentence) {
                counter++;
            }
        }
        return counter;

    }


    public static int find(String message, String sentence) {
        char[] charArray = message.toCharArray();
        char[] sentenceArray = sentence.toCharArray();
        int tmpI = 0;
        int i = 0;
        int j;
        boolean found = true;
        while (i < charArray.length && found) {
            if (charArray[i] == sentenceArray[0]) {
                j = 1;
                tmpI = i;
                while (found && sentenceArray.length > j) {
                    if ((charArray[i] == sentenceArray[j])) {
                        found = true;
                    } else {
                        found = false;
                    }
                    i++;
                    j++;
                }
            }
            i++;
        }


        return tmpI;
    }


}
