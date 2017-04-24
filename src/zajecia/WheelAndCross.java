package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-20.
 */
public class WheelAndCross {

    public static void main(String[] args) {
        char[][] gameBoard = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        //Zajecia10.fillWithRandomNumbers(3,10,0));
        Scanner scanner = new Scanner(System.in);
        int[] positionfromuser = new int[2];

        for (int i = 0; i < 9; i++) {
            boolean inputFromUserFlag = false;
            displayBoard(gameBoard);
            int position = 0;
            while (!inputFromUserFlag) {
                System.out.println("Insert sign position");
                position = scanner.nextInt();
                inputFromUserFlag = validatePositionFromUser(position, gameBoard);
                if (!inputFromUserFlag) {
                    System.out.println("Wrong positoon. Insert again.");
                }
            }

            positionfromuser = convertPositon(position);
            gameBoard[positionfromuser[0]][positionfromuser[1]] = (i % 2 == 0) ? 'X' : 'O';
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
        System.out.println("End of game: ");
        displayBoard(gameBoard);

    }


    public static boolean validatePositionFromUser(int positionFromUser, char[][] gameBoard) {

        int[] ints = convertPositon(positionFromUser);

        return (positionFromUser > 0 && positionFromUser < 10 &&
                isFieldEmpty(gameBoard, ints[0], ints[1])
        );
    }

    public static boolean isFieldEmpty(char[][] gameBoard, int i, int j) {
        return !(gameBoard[i][j] == 'X' || gameBoard[i][j] == 'O');
    }

    public static int[] convertPositon(int positionFromUser) {
        int[] position = new int[2];
        position[0] = (positionFromUser - 1) / 3;
        position[1] = (positionFromUser - 1) % 3;

        return position;
    }


    public static void displayBoard(char[][] gameBoard) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(gameBoard[i][j]);
                if (j != 2) {
                    System.out.print("|");
                }
            }
            if (i != 2) {
                System.out.print("\n-----\n");
            }
        }
        System.out.println();
    }

}