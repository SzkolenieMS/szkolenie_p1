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
            System.out.println("Choose one number:");
            System.out.println("1. + ");
            System.out.println("2. - ");
            System.out.println("3. * ");
            System.out.println("4. / ");
            System.out.println("5. Exit");
            System.out.println("6. Wartosc bezwzgledna z roznicy"); 
            System.out.println();
            int nachose = scanner.nextInt();
            if (nachose > 0 && nachose < 7) {
                if (nachose == 1) {
                    System.out.print("First number: ");
                    int element1 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Second number: ");
                    int element2 = scanner.nextInt();
                    System.out.println();
                    System.out.println("Suma: " + (element1 + element2));
                } else if (nachose == 2) {
                    System.out.print("First number: ");
                    int element1 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Second number: ");
                    int element2 = scanner.nextInt();
                    System.out.println();
                    System.out.println("Roznica: " + (element1 - element2));
                } else if (nachose == 3) {
                    System.out.print("First number: ");
                    int element1 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Second number: ");
                    int element2 = scanner.nextInt();
                    System.out.println();
                    System.out.println("Iloczyn: " + (element1 * element2));
                } else if (nachose == 4) {
                    System.out.print("First number: ");
                    int element1 = scanner.nextInt();
                    System.out.println();
                    int element2 = scanner.nextInt();
                    System.out.println();
                    if (element2 == 0) {
                        System.out.print("Nie dziel przez 0: ");
                    } else {
                        System.out.println("Iloraz: " + (element1 / (double) element2));
                    }
                } else if (nachose == 5) {
                    i = 1;
                } else if (nachose == 6) {
                    System.out.print("First number: ");
                    int element1 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Second number: ");
                    int element2 = scanner.nextInt();
                    System.out.println();
                    int roznica = abs(element1, element2);
                    System.out.println("Wartosc bezwzglednia = " + roznica);
                } else {
                    System.out.println("Numbers from 1-5");
                }
            }
        }
    }


    public static int abs(int number1, int number2) {
        int roznica = number1 - number2;
        if (roznica < 0) roznica *= -1;
        return roznica;
    }


}
