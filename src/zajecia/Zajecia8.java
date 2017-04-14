package zajecia;

/**
 * Created by RENT on 2017-04-13.
 */
public class Zajecia8 {
    public static void main(String[] args) {
//        System.out.println(toUpperCase("test"));
//        System.out.println(sumNumbersPremium("test 12 test 333 "));
//        System.out.println(subString("123456789ala ma konta", 4));
//        System.out.println(subString("123456789ala ma konta", 4, 7));
        System.out.println(sumNumbers("test 123 test"));
    }






    public static String subString(String message, int startIndex) {

        char[] charArray = message.toCharArray();
        char[] newCharArray = new char[charArray.length];
        for (int i = startIndex; i < message.length(); i++) {
            newCharArray[i - startIndex + 1] = charArray[i];

        }

        return new String(newCharArray);
    }


    public static String subString(String message, int startIndex, int endIndex) {
        if (endIndex < startIndex) {
            System.out.println("Error");
            return null;
        }
        char[] charArray = message.toCharArray();
        char[] newCharArray = new char[charArray.length];
        for (int i = startIndex; i < endIndex; i++) {
            newCharArray[i - startIndex + 1] = charArray[i];

        }

        return new String(newCharArray);

    }


    public static int sumNumbersPremium(String message) {
        char[] charArray = message.toCharArray();
        String numberString;
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                numberString = "";
                while (charArray[i] >= 48 && charArray[i] <= 57) {
                    numberString += charArray[i];
                    i++;
                }
                sum += Integer.parseInt(numberString);
            }
        }
        return sum;
    }


    public static int sumNumbers(String message) {
        char[] charArray = message.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                sum += charArray[i] - 48;
            }
        }
        return sum;


    }

    public static String toLowerCase(String message) {
        char[] charArray = message.toCharArray();
        if (charArray[0] >= 65 && charArray[0] <= 90) {
            charArray[0] += 32;
        }
        return new String(charArray);
    }


    public static String toUpperCase(String message) {
        char[] charArray = message.toCharArray();
        if (charArray[0] >= 97 && charArray[0] <= 122) {
            charArray[0] -= 32;
//            charArray[0] = charArray[0] - 32;
        }
        return new String(charArray);

    }

    public static boolean startsWith(String message, String someValue) {
        char[] charArray = message.toCharArray();
        char[] someValueArray = someValue.toCharArray();
        char[] newCharArray = new char[someValueArray.length];
        for (int i = 0; i < someValueArray.length; i++) {
            newCharArray[i] = charArray[i];
        }
        return newCharArray == someValueArray;
    }


    public static boolean isPalindrome(String message) {
        char[] charArray = message.toCharArray();
        char[] newArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            newArray[i] = charArray[charArray.length - i - 1];
        }
        return charArray == newArray;
    }


    public static String ananimOf(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = charArray[charArray.length - i - 1];
        }
        return new String(charArray);
    }


    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();
        char[] newMessageArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                newMessageArray[i] = (char) (charArray[i] - 32);
            } else if (charArray[i] >= 65 && charArray[i] <= 90) {
                newMessageArray[i] = (char) (charArray[i] + 32);
            }
        }
        return new String(newMessageArray);

    }

    public static int countWords(String message) {
        char[] charArray = message.toCharArray();
        int counter = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 32) {
                counter++;
            }
        }
        return counter;
    }


    public static int countSmallLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                counter++;
            }
        }
        return counter;
    }


    public static int countCapitalLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {
                counter++;
            }
        }
        return counter;
    }


    public static int counterCharacter(String message, char character) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == character) {
                counter++;
            }
        }

        return counter;
    }


}
