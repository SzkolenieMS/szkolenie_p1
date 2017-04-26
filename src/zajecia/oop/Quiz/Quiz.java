package zajecia.oop.Quiz;

import zajecia.oop.Quiz.question.MockQuestionsRepository;
import zajecia.oop.Quiz.question.Question;
import zajecia.oop.Quiz.result.FileResultsRepository;
import zajecia.oop.Quiz.result.MockResultsRepository;
import zajecia.oop.Quiz.result.Result;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {

        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        QuizInterface quizInterface = new QuizInterface();
        FileResultsRepository ResultsRepository = new FileResultsRepository("C:\\Users\\RENT\\IdeaProjects\\szkolenie_p1\\src\\quiz.txt");
        boolean gameFlag = true;
        String playerName = "";
        while (gameFlag) {
            int decision = quizInterface.menu();
            switch (decision) {
                case 1:
                    while (playerName.equals("")) {
                        playerName = quizInterface.insertName();
                    }
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
                    Result playerResult = new Result(playerName, correctAnswerCounter);
                    ResultsRepository.add(playerResult);
                    quizInterface.showResult(playerResult);
                    break;
                case 2:
                    quizInterface.showTopResults(ResultsRepository.getTopResults(10));
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
