package zajecia;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-05.
 */
public class Kalkulator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i == 0) {
            System.out.println();
            System.out.println("Choose one number:");
            System.out.println("1. + ");
            System.out.println("2. - ");
            System.out.println("3. * ");
            System.out.println("4. / ");
            System.out.println("5. Exit");
            System.out.println("6. Wartosc bezwzgledna z roznicy");
            System.out.println("7. Suma liczby do 0");
            System.out.println("8. srednia liczb");
            System.out.println();
            int nachose = scanner.nextInt();
            if (nachose > 0 && nachose < 9) {
                if (nachose == 1) {
                    sum(getFirst(), getSecond());
                } else if (nachose == 2) {
                    division(getFirst(), getSecond());
                } else if (nachose == 3) {
                    multiply(getFirst(), getSecond());

                } else if (nachose == 4) {
                    divide(getFirst(), getSecond());
                } else if (nachose == 5) {
                    i = 1;
                } else if (nachose == 6) {
                    int roznica = abs(getFirst(), getSecond());
                    System.out.println("Wartosc bezwzglednia = " + roznica);

                } else if (nachose == 7) {
                    sumOftakennumbers(getFirst());
                }else if (nachose ==8) {

                    System.out.print("Give Me amount of numbers: ");
                    int count= scanner.nextInt();
                    System.out.println();

                    int[] array = new int[count];
                    for (int j = 0; j < count ; j++) {
                        array[j] = giveMeNumber();

                    }
                    avg(array);


                } else {
                    System.out.println("Numbers from 1-9");
                }
            }
        }
    }

    public static void avg(int[] array){

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("average " + (double) sum / array.length);
    }


    public static int giveMeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give Me number: ");
        int element1 = scanner.nextInt();
        System.out.println();
        return element1;
    }



    public static int getFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int element1 = scanner.nextInt();
        System.out.println();
        return element1;
    }

    public static int getSecond() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Second number: ");
        int element2 = scanner.nextInt();
        System.out.println();
        return element2;
    }


    public static void sumOftakennumbers(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum = sum + i;
        }
        System.out.println(sum + " - suma dod " + number);
    }


    public static void multiply(int number1, int number2) {
        System.out.println("Iloczyn: " + (number1 * number2));
    }


    public static void sum(int number1, int number2) {
        System.out.println("Suma: " + (number1 + number2));
    }

    public static void division(int number1, int number2) {
        System.out.println("Roznica: " + (number1 - number2));
    }

    public static void divide(int number1, int number2) {
        if (number1 == 0) {
            System.out.print("Nie dziel przez 0: ");
        } else {
            System.out.println("Iloraz: " + (number1 / (double) number2));
        }
    }

    public static int abs(int number1, int number2) {
        int roznica = number1 - number2;
        if (roznica < 0) roznica *= -1;
        return roznica;
    }
}
