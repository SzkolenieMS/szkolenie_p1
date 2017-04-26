package zajecia.oop.Quiz.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class MockResultsRepository {

    private Result[] results;
    private int resultsCounter=0;


    public MockResultsRepository() {

        this.results = new Result[100];
        add(new Result("Maciej", 100));
        add(new Result("Jan",1));
        add(new Result("Adam", 100));
        add(new Result("Karol",1));
    }

    public Result[] getAllResults(){
        Result[] resultsToReturn = new Result[resultsCounter];
        for (int i = 0; i < resultsCounter; i++) {
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }



    public Result[] getTopResults (int n){
        Result[] resultsToReturn = new Result[n];
        int loopSize = n<resultsCounter ? n : resultsCounter;

        for (int i = 0; i < loopSize; i++) {
            resultsToReturn[i] = results[i];
        }
        return resultsToReturn;
    }

    public void add(Result result){
        this.results[resultsCounter] = result;
        this.resultsCounter++;
    }

}
