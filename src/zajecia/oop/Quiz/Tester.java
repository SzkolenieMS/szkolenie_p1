package zajecia.oop.Quiz;

import zajecia.oop.Quiz.question.FileQuestionsRepository;
import zajecia.oop.Quiz.question.Question;
import zajecia.oop.Quiz.question.QuestionsRepository;
import zajecia.oop.Quiz.result.FileResultsRepository;
import zajecia.oop.Quiz.result.Result;

/**
 * Created by RENT on 2017-04-26.
 */
public class Tester {
    public static void main(String[] args) {


//        FileResultsRepository repository = new FileResultsRepository("C:\\Users\\RENT\\IdeaProjects\\szkolenie_p1\\src\\quiz.txt");
//        Result[] allResults1 = repository.getAllResults();
//        repository.add(new Result("Adam", 2));
//        Result[] allResults = repository.getAllResults();
//        Result[] topResults = repository.getTopResults(10);
        QuestionsRepository questionsRepository =
                new FileQuestionsRepository("C:\\Users\\RENT\\IdeaProjects\\szkolenie_p1\\src\\quiz_questions");
        Question[] questions = questionsRepository.getQuestions();

    }
}
