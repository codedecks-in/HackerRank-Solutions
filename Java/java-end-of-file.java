import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kb = new Scanner(System.in);
        String [] str = new String[100000];
        int i =0;
        
        while(kb.hasNext()){
            str[i++] = kb.nextLine();
        }
        kb.close();
        i--;
        int x = i;
        i = 0;
        
        while(i<=x){
            System.out.println((i+1)+" "+str[i]);
            i++;
        }
    }
}
