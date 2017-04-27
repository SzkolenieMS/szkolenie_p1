package zajecia.oop.Quiz;

import zajecia.oop.Quiz.question.FileQuestionsRepository;
import zajecia.oop.Quiz.question.MockQuestionsRepository;
import zajecia.oop.Quiz.question.Question;
import zajecia.oop.Quiz.question.QuestionsRepository;
import zajecia.oop.Quiz.result.FileResultsRepository;
import zajecia.oop.Quiz.result.MockResultsRepository;
import zajecia.oop.Quiz.result.Result;
import zajecia.oop.Quiz.result.ResultsRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {

//        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        FileQuestionsRepository questionsRepository = new FileQuestionsRepository("C:\\Users\\RENT\\IdeaProjects\\szkolenie_p1\\src\\quiz_questions");
        QuizInterface quizInterface = new QuizInterface();
        ResultsRepository resultsRepository = new FileResultsRepository("C:\\Users\\RENT\\IdeaProjects\\szkolenie_p1\\src\\quiz.txt");
        game(questionsRepository,resultsRepository,quizInterface);
    }
        public static void game (QuestionsRepository questionsRepository, ResultsRepository resultsRepository, QuizInterface quizInterface){
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
                    resultsRepository.add(playerResult);
                    quizInterface.showResult(playerResult);
                    break;
                case 2:
                    quizInterface.showTopResults(resultsRepository.getTopResults(10));
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
