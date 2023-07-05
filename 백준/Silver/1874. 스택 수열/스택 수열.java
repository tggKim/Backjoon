import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new  BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int number=1;

        Stack<Integer> s = new Stack<>();

        for(int i=0;i<N;i++){
            int num=Integer.parseInt(br.readLine());

            while(number<=num){
                s.push(number);
                number++;
                sb.append("+\n");
            }

            if(s.peek()==num) {
                s.pop();
                sb.append("-\n");
            }
        }
        if(s.empty()){
            System.out.println(sb);
        }
        else{
            System.out.println("NO");
        }
    }
}