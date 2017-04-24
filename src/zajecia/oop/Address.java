package zajecia.oop;

/**
 * Created by RENT on 2017-04-24.
 */
public class Address {
    public String street;
    public String city;
    public String flatNumber;
    public String postalCode;
    public String land;

    public void display() {
        System.out.println("Miasto: " + city + " ulica " + street + " nr. " + flatNumber);
        System.out.println("Kod: " + postalCode + ", " + land);


    }

}
