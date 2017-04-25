package zajecia.oop.Quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultsRepository {

    private Result[]results;


    public MockResultsRepository(Result[] results) {

        this.results = new Result[4];

        results[0] = new Result("Maciej", 100);
        results[1] = new Result("Jan",1);
        results[2] = new Result("Adam", 100);
        results[3] = new Result("Karol",1);

    }

    public Result[] getAllResults(){
        return results;
    }



    public Result[] getTopResults (int n){
    //1. 123123123
    //2. 12321312
    //3. 123123
        return null;
    }

}
