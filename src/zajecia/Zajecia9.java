package zajecia;

/**
 * Created by RENT on 2017-04-14.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        System.out.println(cezarCode("test 123"));


    }


    public static String cezarCode(String message) {


        char[] charArray = message.toCharArray();
        char[] newCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            newCharArray[i] = (char) (charArray[i] + 1);
        }
        return new String(newCharArray);
    }


    public static String decodeCezarCode(String message) {


        char[] charArray = message.toCharArray();
        char[] newCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            newCharArray[i] = (char) (charArray[i] -1);
        }
        return new String(newCharArray);
    }



}
