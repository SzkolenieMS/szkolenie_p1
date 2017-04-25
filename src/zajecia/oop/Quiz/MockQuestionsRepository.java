package zajecia.oop.Quiz;

import java.util.Arrays;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockQuestionsRepository {
    public Question[] getQuestions(){
        Question[] questions = new Question[3];
        String[] answers = {"22","33","44","55"};
        String[] answers2 = {"7","4","2","0"};
        String[] answers3 = {"Poznan", "Poznan", "Poznan", "Miasto"};
        questions[0] = new Question("Ile lat ma prezydent",2,answers );
        questions[1] = new Question("Ile jest 2x2",1,answers2 );
        questions[2] = new Question("Co jest stolica Wielkopolski",3,answers3 );
        return questions;
    }





}
