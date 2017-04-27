package zajecia.oop.Quiz.result;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-26.
 */
public class FileResultsRepository implements ResultsRepository{
    private String pathToFile;
    private File fileWithResult;


    public FileResultsRepository(String pathToFile) {
        this.pathToFile = pathToFile;
        this.fileWithResult = new File(pathToFile);
    }


    public int getSize() {
        int counter = 0;
        try {
            Scanner scanner = new Scanner(fileWithResult);
            while (scanner.hasNextLine()) {
                counter++;
                scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return counter;
    }

    public Result[] getAllResults() {
        Result[] results = new Result[getSize()];
        try {
            Scanner scanner = new Scanner(fileWithResult);
            int i = 0;
            while (scanner.hasNextLine()) {
                results[i] = mapToResult(scanner.nextLine());
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return results;
    }

    private Result mapToResult(String resultString) {
        String[] stringResult = resultString.split(" ");
        Result resultToMap = new Result(" ", 0);
        if (stringResult.length>1) {
             resultToMap = new Result(stringResult[0], Integer.parseInt(stringResult[1]));
        }         return resultToMap;
    }

    public Result[] getTopResults (int n){
        Result[] resultsToReturn = new Result[n];
        Result[] allResults = getAllResults();
        int loopSize = n< getSize()? n : getSize();
        for (int i = 0; i < loopSize; i++) {
            resultsToReturn[i] = getAllResults()[i];
        }
        return resultsToReturn;
    }


    public void add(Result result) {

            try (FileWriter fw = new FileWriter(fileWithResult, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
