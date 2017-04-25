package zajecia.oop.Quiz;

import java.util.Arrays;

/**
 * Created by RENT on 2017-04-25.
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, int correctAnswer, String[] answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answers=" + Arrays.toString(answers) +
                '}';
    }

    public boolean checkAnswer(int answer){
        return correctAnswer==answer;

    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }
}
