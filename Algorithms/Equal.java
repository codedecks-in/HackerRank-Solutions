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

class Result {

    /*
     * Complete the 'equal' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int equal(List<Integer> arr) {
    // Write your code here
    /*The idea is to first find the minimum value in the list, 
    subtract the same from each element and check the least step required to make
    the value 0 using 1,2 and 5 (as given in question). 
    
    
    let this function be called f which takes minimum value min, it is possible that f(min)>f(min-1) or f(min)>f(min-2) 
    but as the greatest denomination in question is 5 it is certain that f(min)<f(min-5) 
    so our objective is to check till f(min-4) */
    ArrayList<Integer> res=new ArrayList<Integer>();
    //iterating loop only til 4 as f(min) is surely less than f(min-5) as discussed above
    for(int j=0;j<4;j++){
        int minval=Collections.min(arr); //minimum value in list
        minval-=j;
    int count=0;
    for(Integer i:arr){
        count+=(i-minval)/5+((i-minval)%5)/2+((i-minval)%5)%2; // least way to get a number to 0 using denominations 5,2 and 1 as given in ques
    }
    res.add(count);
    }
    return Collections.min(res); // returning minimum value of the 4 collected values.
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                int result = Result.equal(arr);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

