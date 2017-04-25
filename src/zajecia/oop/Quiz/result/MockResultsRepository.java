package zajecia.oop.Quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultsRepository {
    public Result[] getAllResults(){
        Result[] mockResults = new Result[4];

        mockResults[0] = new Result("Maciej", 100);
        mockResults[1] = new Result("Jan",1);
        mockResults[2] = new Result("Adam", 100);
        mockResults[3] = new Result("Karol",1);

        return mockResults;
    }



}
