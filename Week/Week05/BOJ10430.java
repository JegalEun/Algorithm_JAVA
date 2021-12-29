package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10430 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		String[] n = input.split(" "); 
		int []num = new int[n.length];
		
		for(int i=0;i<num.length;i++) {
			num[i]=Integer.parseInt(n[i]);
		}
		
		int result = 0;
		result=(num[0]+num[1])%num[2];
		sb.append(result+"\n");
		
		result=((num[0]%num[2])+(num[1]+num[2]))%num[2];
		sb.append(result+"\n");
		
		result=(num[0]*num[1])%num[2];
		sb.append(result+"\n");
		
		result=((num[0]%num[2])*(num[1]%num[2]))%num[2];
		sb.append(result+"\n");
		
		System.out.println(sb);
		
		
		
	}

}
