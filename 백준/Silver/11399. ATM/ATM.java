import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new  BufferedWriter(new OutputStreamWriter(System.out));

       int N = Integer.parseInt(br.readLine());
       int[] arr=new int[N];

       StringTokenizer st = new StringTokenizer(br.readLine());
       for(int i=0;i<N;i++){
           arr[i]=Integer.parseInt(st.nextToken());
       }

       int num=0;
       int answer=0;
       for(int i=0;i<N;i++){
           int min = arr[i];
           int index=i;
           for(int j=i;j<N;j++){
               if(arr[j]<min){
                   min=arr[j];
                   index=j;
               }
           }
           int temp=arr[i];
           arr[i]=arr[index];
           arr[index]=temp;
           num+=arr[i];
           answer+=num;
       }
       System.out.println(answer);
    }
}