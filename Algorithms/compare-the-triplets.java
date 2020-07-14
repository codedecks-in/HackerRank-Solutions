import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        // resultant List which will store alice & bob scores
        List<Integer> scores = new ArrayList<>();

        // intialize both alice's & bob's score to 0
        int aliceScore = 0;
        int bobScore = 0;

        // iterate both the lists a, b
        // can take any of the sizes as compare condition since both sizes are 3
        for (int i=0; i<a.size(); i++){
            if(a.get(i) > b.get(i)){
                aliceScore += 1;
            }
            else if(b.get(i) > a.get(i)) {
                bobScore += 1;
            }
        }

        // first we will add alice's score to scores list
        scores.add(aliceScore);

        // now add bob's score to scores list
        scores.add(bobScore);

        // scores = [alicesScore, bobScore]
        return scores;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}