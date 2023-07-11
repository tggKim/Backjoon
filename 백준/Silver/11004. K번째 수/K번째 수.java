import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new  BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

       int N = Integer.parseInt(st.nextToken());
       int[] arr=new int[N];
       int index=Integer.parseInt(st.nextToken());

       st=new StringTokenizer(br.readLine());
       for(int i=0;i<N;i++){
           arr[i]=Integer.parseInt(st.nextToken());
       }

        method(arr,0,N-1);
        System.out.println(arr[index-1]);
    }

    static void method(int[] arr, int start,int end){
        int num=sort1(arr,start,end);

        if(start<num-1){
            method(arr,start,num-1);
        }
        if(end>num){
            method(arr,num,end);
        }
    }

    static int sort1(int[] arr,int start,int end){
        int pivot=arr[(start+end)/2];
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }

    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
