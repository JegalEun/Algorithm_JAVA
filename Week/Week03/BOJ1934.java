import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1934 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			
			int input1 = Integer.parseInt(st.nextToken());
			int input2 = Integer.parseInt(st.nextToken());
			
			int c = gcd(input1,input2);
			
			sb.append(input1*input2/c+"\n");
			
		}
		
		System.out.println(sb);

	}
	
	public static int gcd(int a, int b) {
		
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		
		return a;
	}

}
