import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new  BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] answer = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Stack<Integer> s = new Stack<>();
        for(int i=0;i<N;i++){
            if(s.empty()){
                s.push(i);
            }
            else{
                while(arr[s.peek()]<arr[i]){
                    answer[s.peek()]=arr[i];
                    s.pop();
                    if(s.empty()){
                        break;
                    }
                }
                s.push(i);
            }
        }

        while(!s.empty()){
            answer[s.peek()]=-1;
            s.pop();
        }

        for(int i=0;i<N;i++){
            bw.write(answer[i]+" ");
        }
        bw.flush();
    }
}

