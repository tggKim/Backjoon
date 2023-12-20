import java.util.*;
import java.io.*;
public class Main{
    static int[] arr;
    static Integer[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s;
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new Integer[n];
        s = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s.nextToken());
        }
        dp[0]=arr[0];
        int max = method(n-1);
        for(int i=0;i<n;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }
        System.out.println(max);
    }
    static int method(int n){
        if(dp[n]==null){
            dp[n]=Math.max(method(n-1)+arr[n],arr[n]);
        }
        return dp[n];
    }
}