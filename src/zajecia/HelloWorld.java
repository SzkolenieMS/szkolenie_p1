package zajecia;


import com.sun.org.apache.bcel.internal.generic.RETURN;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import java.util.Scanner;

public class HelloWorld { //classa
    public static void main(String[] args) { //funkcja - psvm

        // firstclass();
        // checkAge();
        // isNumberEven();
        // checkBigger();
        //table();
        //arrayTest();
        //displayEvenNumbers();
        //greaterThan0();
        //greaterThan0andeven();
        //sumofelements();
        //sumofepositive();
        //sumofeven();
        //sumofevenpositive();
        //avg();
        //sumOf();
//        avgsumMultipliedBy();
//        writeData();
        //sumOftakennumbers();
//        shortcuts();
    }

    public static void shortcuts() {
        //ctrl + alt + l
        System.out.println(" ctrl + alt + l  - formatuje kod");
        System.out.println(" ctrl + shift + a - dostep do fajnych funkcji");
        System.out.println(" ctrl + shift + a -> quick sqitch scheme -> look and feal- zmiana wygladu");
        System.out.println(" ctrl + c - kopiowanie");
        System.out.println(" ctrl + v - wklejanie");
        System.out.println(" ctrl + z - cofanie");
        System.out.println(" ctrl + b - przejscie do deklaracji");
        System.out.println(" alt+ enter - dodanie 'importu'");
        System.out.println(" ctrl + f5 - uruchomienie programu");
        System.out.println(" sout - system out println");
        System.out.println(" psvm - funkcja main");
        System.out.println(" i++ - to - i+=1 - to - i = i+1");
        System.out.println(" shift + f6 - rename elementu");
        System.out.println(" alt + j - zaznaczanie wystapien zaznaczenia");
        System.out.println(" ctrl + shift + v - lista tego co kopiowalismy");
        System.out.println(" ctrl + p - pokazuje jakie argumenty podac");
        System.out.println("rm -rf nazwa_katalogu [rekursywne usuwanie]");
        System.out.println("alt+9 i ctrl+D - porowanie wersji");


        System.out.println("git add . [dodanie wszystkich plikow]");
        System.out.println("git commit -m jakis opis w cudzyslowie");
        System.out.println("git push -u origin master");
        System.out.println("git clone ADRES_HTTTPS [pobranie w domu - klon wersji z github]");
        System.out.println("git stash && git pull [pobieranie z repo internetowego]");

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


    public static void avgsumMultipliedBy() {
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * i;

        }
        System.out.println(sum + " - suma elemntow");
        System.out.println(numbers.length + " - ilosc elementow");
        System.out.println((double) sum / numbers.length + " - srednia suma");
    }

    public static void sumOfnumbers() {
        int sum = 0;
        int number = 5;
        for (int i = 1; i < number; i++) {
            sum = sum + i;

        }
        System.out.println(sum + " - suma dod 5");
    }

    public static void avg() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("average " + (double) sum / array.length);
    }

    public static void sumofeven() {


        int sum = 0;
        int[] array = {1, 2, 3, 4, 5, -5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                sum = sum + array[i];
        }
        System.out.println(sum + " - suma parzystych");

    }

    public static void sumofepositive() {


        int sum = 0;
        int[] array = {1, 2, 3, 4, 5, -5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                sum = sum + array[i];
        }
        System.out.println(sum + " - suma parzystych");

    }

    public static void sumofevenpositive() {


        int sum = 0;
        int[] array = {1, 2, 3, 4, 5, -5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum + " - suma parzystych dodatnich");

    }

    public static void sumofelements() {


        int sum = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -3, -6, 23};
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum + " - suma");

    }

    public static void greaterThan0andeven() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -3, -6, 23};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                System.out.println(array[i] + " is bigger than 0 and even");
            }
        }
    }

    public static void greaterThan0() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -3, -6, 23};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i] + " is bigger than 0");
            }
        }
    }

    public static void displayEvenNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + "is even");
            }


        }


    }

    public static void arrayTest() {
        int[] array = {1, 2, 3, 4, 5, 6, 7}; //instancjonowanie

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }


    }

    public static void table() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        System.out.println(array[5]);
//        System.out.println(array[6]);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public static void firstclass() {
        System.out.println("Hello world"); //wypisywanie w konsoli - sout
        System.out.println(5);
        int number = 2;
        int secondnumber = 3;
        System.out.println(number + 9);
        System.out.println(number + " - number");
        System.out.println(secondnumber + " - secondnumber");
        System.out.println(secondnumber + number);

        if (number > secondnumber) {

            System.out.println("number is bigger");
        } else {
            System.out.println("number is lower");


        }

        String a = "test"; // text variable
        int b = 2; // integer variable
        double c = 2.5; //double variable


    }

    public static void checkAge() {
        int age = 18;
        if (age >= 18) {
            System.out.println("age over 18");
        } else {
            System.out.println("age under 18");
        }


    }

    public static void isNumberEven() {

        int number = 3;
        if (number % 2 == 0) {

            System.out.println("number is even");
        } else {
            System.out.println("number is not even");
        }
    }

    public static void checkBigger() {
        int number1 = 3;
        int number2 = 6;

        if (number1 > number2) {
            System.out.println("number1 is bigger");
        } else if (number1 == number2) {
            System.out.println("numbers are equals");
        } else {
            System.out.println("number2 is bigger");

        }


    }


}
