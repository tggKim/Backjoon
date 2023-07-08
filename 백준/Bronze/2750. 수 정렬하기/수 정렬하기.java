import java.util.StringTokenizer;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int[] k=new int[num];
		
		for(int i=0;i<num;i++) {
			k[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-1;j++) {
				if(k[j]>k[j+1]) {
					int x=k[j+1];
					k[j+1]=k[j];
					k[j]=x;
				}
			}
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(k[i]);
		}
	}
}
