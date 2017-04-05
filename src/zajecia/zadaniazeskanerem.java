package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */
public class zadaniazeskanerem {
    public static void main(String[] args) {

//        sumOftakennumbers();
//        writeData();
//        max();
//        isEven();
//        everySecondElement();
//    sumoddElements();
//        countevenelements();
//addPreviousElement();
//        multiplyby2();
//        fillArray();
//        fillArraywithUnknown();
//        addElementsMultipliedBy();


    }



    public static void fillArraywithUnknown() {


        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int y = 1;
        while (array[y - 1] != 1) {

            System.out.println("give me next number; Press 1 to break");
            array[y] = scanner.nextInt();
            y++;
        }

        for (int i = 0; i < y; i++) {
            System.out.println("number " + i + " is " + array[i]);

        }


    }


    public static void addElementsMultipliedBy() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("give me size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + (i + 1) + " element");
            int element = scanner.nextInt();
            if (i == 0) {
                array[i] = element;
            } else {

                array[i] = array[i - 1] * element;
            }
        }
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0)
                System.out.print(array[i] + " ");

            sum += array[i];
        }
        System.out.println("");
        System.out.println("suma = " + sum);
        System.out.println("srednia = " + (double) sum / array.length);

    }


    public static void fillArray() {

        //int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("give me size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("give me next number");
            array[i] = scanner.nextInt();

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("number " + i + " is " + array[i]);

        }


    }


    public static void multiplyby2() {
        int[] array = {2, 3, 4, -5, -6, -4, -1, 34, 34, 34};
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] > 0) {
                array[i] = array[i] * 2;
            }

        }
    }


    public static void addPreviousElement() {
        int[] array = {2, 3, 4, -5, -6, -4, -1, 34, 34, 34};
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
            array[i] = array[i] + array[i - 1];
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void incrementelements() {
        int[] array = {2, 3, 4, -5, -6, -4, -1, 5234, 233, 34, 34, 34};

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                array[i]++;
            }
        }
    }


    public static void countevenelements() {
        int[] array = {2, 3, 4, 5, 6, 7, 9, 6, 5234, 233, 34, 34, 34};
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("count of even elements " + count);
    }

    public static void sumoddElements() {
        int[] array = {2, 3, 4, 5, 6, 7, 9, 6, 5234, 233, 34, 34, 34};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 1) {
                sum += array[i];
            }
        }

        System.out.println("sum of odd elements " + sum);
    }

    public static void everySecondElement() {
        int[] array = {2, 3, 4, 5, 6, 7, 9, 6, 5234, 233, 34, 34, 34};

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {
                System.out.println(array[i]);

            }

        }
    }


    public static void isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inser number1: ");
        int number1 = scanner.nextInt();

        if (number1 % 2 == 0) {
            System.out.println("number1 is even");

        } else {
            System.out.println("number1 is NOT even");
        }
    }


    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inser number1: ");
        int number1 = scanner.nextInt();

        System.out.println("Inser number2: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("number1 is bigger");
        } else if (number2 > number1) {
            System.out.println("number2 is bigger");

        } else {
            System.out.println("numbers are equals");
        }


    }


    public static void sumOftakennumbers() {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inser number: ");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            sum = sum + i;

        }
        System.out.println(sum + " - suma dod " + number);
    }


    public static void writeData() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is : " + name);
        int number = scanner.nextInt();
        System.out.println("Your number is : " + number);

    }

}
