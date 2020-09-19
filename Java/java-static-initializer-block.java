import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static boolean flag = true;
     public static int B = 0;
     public static int H = 0;

     static{
     //int flag = 1;
     Scanner kb = new Scanner(System.in);
            
     B = kb.nextInt();
     H = kb.nextInt();
     
     if(B<=0 || H<=0){
         System.out.println("java.lang.Exception: Breadth and height must be positive");
         flag=false;
         }
      }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
