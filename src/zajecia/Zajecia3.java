package zajecia;

/**
 * Created by RENT on 2017-04-06.
 */
public class Zajecia3 {
    public static void main(String[] args) {

        fahrenheittoCelsius(80);
        celsiusToFarenheit(25);
        minMax(3,4,9);



    }

    public static void fahrenheittoCelsius (int fahrenheit) {
        double celsjusz = (fahrenheit -32) / 1.8;
        System.out.println(fahrenheit + "farenow to " + celsjusz + "celsjuszy");

    }

    public static void celsiusToFarenheit (int celsius) {
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + "celsjuszy to " + fahrenheit + "farenow");


    }


    public static void minMax(int a, int b, int c) {

        if ( a > b && a>c) {
                System.out.println("a jest najwieksze");


        }else if (b>a && b>c) {
            System.out.println("b jest najwieksze");

        } else {
            System.out.println("c jest najwieksze");

        }

        if (a <b && a<c) {
                System.out.println("a jest najmniejsze");


            } else if (b>a && b<c) {
                System.out.println("b jest najmniejsze");


            } else {

                System.out.println("c jest najmniejsze");
            }





        }





    }


}