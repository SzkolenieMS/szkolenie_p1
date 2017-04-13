package zajecia;

/**
 * Created by RENT on 2017-04-13.
 */
public class Zajecia8 {
    public static void main(String[] args) {




    }



    public static int counterCharacter(String message, char character){
        char[] charArray = message.toCharArray();
        int counter =0;
        for (int i = 0; i <charArray.length ; i++) {
            if (charArray[i] == character) {
                counter++;
            }
        }

        return  counter;
    }



}
