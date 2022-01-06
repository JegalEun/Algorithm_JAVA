package Week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ11653 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int i=2;
		
		while(n>1) {
			
			if(n%i==0) {
				sb.append(i+"\n");
				n=n/i;
				i=2;
				continue;
			}
			i++;
		}
	
		System.out.println(sb);
	}

}
