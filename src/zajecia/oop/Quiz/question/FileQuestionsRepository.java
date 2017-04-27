package zajecia.oop.Quiz.question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-27.
 */
public class FileQuestionsRepository implements QuestionsRepository {

    private String pathToFile;
    private File fileWithResult;

    public FileQuestionsRepository(String pathToFile) {
        this.pathToFile = pathToFile;
        this.fileWithResult = new File(pathToFile);
    }


    public int getSize() {
        int counter = 0;
        try {
            Scanner scanner = new Scanner(fileWithResult);
            while (scanner.hasNext()) {
                counter++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return counter / 6;
    }

    @Override
    public Question[] getQuestions() {
        Question[] questions = null;
        try {
            Scanner scanner = new Scanner(fileWithResult);
            questions = new Question[getSize()];
            int index = 0;
            while (scanner.hasNextLine()) {
                String questionText = scanner.nextLine();
                String[] answers = new String[4];
                for (int i = 0; i < answers.length; i++) {
                    answers[i] = scanner.nextLine();
                }
                int correctAnswer = scanner.nextInt();
                scanner.nextLine();
                questions[index] = map(questionText,answers,correctAnswer);
                index++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return questions;
    }



    public Question map ( String questionText, String[] answers, int correctAnswer){
        return new Question(questionText, correctAnswer, answers);
    }

}
