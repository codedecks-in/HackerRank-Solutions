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

        // len is total number of elements in arr
        float len = arr.length;

        // count of positive elements
        int countPositive = 0;

        // count of negative elements;
        int countNegative = 0;

        for(int i=0; i<len; i++){

            // positive number check
            if(arr[i] > 0){
                countPositive++;
            }
            // negative number check
            else if(arr[i] < 0){
                countNegative++;
            }

            if(i == (len-1)){
                // int countZeros = len - (countPositive+countNegative);

                System.out.printf("%1.6f \n",countPositive/len);
                System.out.printf("%1.6f \n",countNegative/len);
                System.out.printf("%1.6f \n",(len -(countPositive+countNegative))/len);
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
