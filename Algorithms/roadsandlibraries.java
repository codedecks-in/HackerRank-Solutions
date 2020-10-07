import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//by jnaneswar
public class Solution {

    // Complete the roadsAndLibraries function below.
    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
       ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n+1);
       for(int i=0;i<=n;i++)
       adj.add(new ArrayList<Integer>());
       for(int i=0;i<cities.length;i++)
       {
           adj.get(cities[i][0]).add(cities[i][1]);
           adj.get(cities[i][1]).add(cities[i][0]);
       }
  
    boolean vis[] = new boolean[n+1];
    ArrayList<Integer> comp = new ArrayList<Integer>();

    for(int i=1;i<=n;i++)
    { 
        if(!vis[i])
        {
            comp.add(dfs(adj,vis,i));
        }

    }
    long ans=0;
    for(int i=0;i<comp.size();i++)
    {
        ans+=Math.min((comp.get(i)-1)*c_road+c_lib,comp.get(i)*c_lib);
    }
    return ans;
    }
    static int dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis , int s)
    {    int ans=1;
        vis[s]=true;
        
        for(int v:adj.get(s))
        {
            if(vis[v]==false)
            ans+=dfs(adj,vis,v);
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nmC_libC_road = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmC_libC_road[0]);

            int m = Integer.parseInt(nmC_libC_road[1]);

            int c_lib = Integer.parseInt(nmC_libC_road[2]);

            int c_road = Integer.parseInt(nmC_libC_road[3]);

            int[][] cities = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] citiesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
                    cities[i][j] = citiesItem;
                }
            }

            long result = roadsAndLibraries(n, c_lib, c_road, cities);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
