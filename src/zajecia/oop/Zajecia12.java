package zajecia.oop;

import java.io.*;

/**
 * Created by RENT on 2017-04-24.
 */
public class Zajecia12 {
    public static void main(String[] args) {

//        File file = new File("C:\\Users\\RENT\\IdeaProjects\\szkolenie_p1\\src\\file.txt");
        Address adres = new Address();
        adres.postalCode = "30-300";
        adres.flatNumber = "12";
        adres.street= "Polna";
        adres.city="Poznan";
        adres.land="Polska";

//        adres.display();
        User user = new User();
        user.firstName = "Maciej";

        user.lastName = "Siebert";
        user.phoneNumber = "123456";
        user.address = adres;
        user.age=40;
//        System.out.println(user.firstName + " " + user.lastName + " age: " + user.age);
//        System.out.println("Phone number " + user.phoneNumber);
//        System.out.println("Address"  + user.address);

            user.display();



    }





    public static void writeToFileTest(File file, String message) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(message);
        }
    }

}
