import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new  BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for(int i=1;i<=N;i++){
            q.add(i);
        }

        int answer=0;
        while(true){
            answer=q.peek();
            q.poll();
            if(q.isEmpty()){
                System.out.println(answer);
                break;
            }
            q.add(q.peek());
            q.poll();
        }
    }
}