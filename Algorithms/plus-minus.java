import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double len = arr.length;

        int posSum = 0;
        int negSum = 0;

        for(int i=0; i<len; i++){
            if(arr[i] < 0){
                negSum++;
            }
            else if(arr[i] > 0){
                posSum++;
            }
            
            // System.out.println(negSum);
            // System.out.println(posSum);
            if(i == (len-1)){
                System.out.printf("%1.6f \n",posSum/len);
                System.out.printf("%1.6f \n",negSum/len);
                System.out.printf("%1.6f \n",(len-(posSum+negSum))/len);
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
