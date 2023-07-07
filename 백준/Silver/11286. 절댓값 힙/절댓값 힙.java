import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new  BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());

        PriorityQueue<MyNumber> pq = new PriorityQueue<>();

        for(int i=0;i<N;i++){
            int a=Integer.parseInt(br.readLine());
            if(a==0){
                if(pq.isEmpty()){
                    System.out.println("0");
                }
                else{
                    System.out.println(pq.peek().num);
                    pq.poll();
                }
            }
            else{
                pq.add(new MyNumber(a));
            }
        }
    }
}

class MyNumber implements Comparable<MyNumber>{
    int num;
    int abs;
    MyNumber(int num){
        this.num=num;
        abs=Math.abs(num);
    }

    @Override
    public int compareTo(MyNumber o){
        MyNumber my=(MyNumber)o;
        if(abs!=my.abs){
            return abs-my.abs;
        }else{
            return  num-my.num;
        }
    }
}