package zajecia.oop.Quiz;

import zajecia.oop.Quiz.question.MockQuestionsRepository;
import zajecia.oop.Quiz.question.Question;
import zajecia.oop.Quiz.result.MockResultsRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {

        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        QuizInterface quizInterface = new QuizInterface();
        MockResultsRepository mockResultsRepository = new MockResultsRepository();
        boolean gameFlag = true;
        while (gameFlag) {
            int decision = quizInterface.menu();
            switch (decision) {
                case 1:

                    String playerName = quizInterface.insertName();
                    quizInterface.beforeStart();
                    Question[] questions = questionsRepository.getQuestions();
                    int correctAnswerCounter = 0;
                    for (int i = 0; i < questions.length; i++) {
                        boolean result = quizInterface.showQuestion(questions[i]);
                        if (result) {
                            quizInterface.correctAnswer();
                            correctAnswerCounter++;
                        } else {
                            quizInterface.incorrectAnswer();
                        }
                    }

                    quizInterface.showResult(playerName, correctAnswerCounter);
                    break;
                case 2:
                    quizInterface.showTopResults(mockResultsRepository.getTopResults(10));
                    break;
                case 0:
                    gameFlag = false;
                    break;
                default:
                    System.out.println("Wrong number");
                    break;
            }
        }
        quizInterface.afterGameEnded();

    }


}
