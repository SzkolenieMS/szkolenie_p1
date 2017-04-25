package zajecia.oop.Quiz;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-25.
 */
public class QuizInterface {
    private Scanner scanner;

    public QuizInterface() {
        this.scanner = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("1. Start");
        System.out.println("2. Wyniki");
        System.out.println("0. Koniec");
        int result = scanner.nextInt();
        this.scanner.nextLine();
        return result;
    }

    public String insertName() {
        System.out.println("Insert Your name");
        return scanner.nextLine();
    }

    public void beforeStart() {
        System.out.println("Press enter to start");
        scanner.nextLine();

    }

    public boolean showQuestion(Question question) {
        System.out.println(question.getQuestion());
        String[] answers = question.getAnswers();
        for (int i = 0; i < answers.length; i++) {
            System.out.println((i + 1) + ". " + answers[i]);
        }
        int answerFromUser = scanner.nextInt();
        scanner.nextLine();
        return question.checkAnswer(answerFromUser - 1);
    }

    public void correctAnswer(){
        System.out.println("Correct answer");
        scanner.nextLine();
    }

    public void incorrectAnswer(){
        System.out.println("Incorrect answer");
        scanner.nextLine();
    }

    public void showResult(String name, int result){
        System.out.println("Congratulation " + name + " you finished with score: " + result);
    }




}
