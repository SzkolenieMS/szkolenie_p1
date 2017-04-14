package zajecia;

/**
 * Created by RENT on 2017-04-14.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(-a);



    }







    private static String cezarCoder(String message,boolean code){


        int offset = code ? 1: -1;
        char[] charArray = message.toCharArray();
        char[] newCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            newCharArray[i] += offset;

        }
        return new String(newCharArray);

    }



    public static String cezarCode(String message) {


        char[] charArray = message.toCharArray();
        char[] newCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 122) {
                newCharArray[i] = 'a';
            } else if (charArray[i] ==90) {
                newCharArray[i] = 'A';
            }else if (charArray[i] ==57) {
                newCharArray[i] = '0';
            }else {
                newCharArray[i] = (char) (charArray[i] + 1);
            }
//
//            if (charArray[i] == 122 || charArray[i] == 90 || charArray[i] == 57 ){
//                charArray[i] -= 25;
//            }else {
//                newCharArray[i] = (char) (charArray[i] + 1);
//            }
        }
        return new String(newCharArray);
    }


    public static String decodeCezarCode(String message) {


        char[] charArray = message.toCharArray();
        char[] newCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 97) {
                newCharArray[i] = 'z';
            } else if (charArray[i] ==65) {
                newCharArray[i] = 'Z';
            }else if (charArray[i] ==48) {
                newCharArray[i] = '9';
            }else {
                newCharArray[i] = (char) (charArray[i] - 1);
            }

//            if (charArray[i] == 97 || charArray[i] == 65 || charArray[i] ==  ){
//                charArray[i] += 25;
//            }else {
//                newCharArray[i] = (char) (charArray[i] + 1);
//            }
        }
        return new String(newCharArray);
    }



}
