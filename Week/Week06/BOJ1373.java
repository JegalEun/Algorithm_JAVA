package Week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1373 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		if(input.length()%3==2) {
			sb.append((input.charAt(0)-'0')*2+(input.charAt(1)-'0'));
		}
		else if(input.length()%3==1){
			sb.append(input.charAt(0));
		}
		
		for(int i=input.length()%3;i<input.length();i+=3){
			sb.append((input.charAt(i)-'0')*4+(input.charAt(i+1)-'0')*2+(input.charAt(i+2)-'0'));
		}
			
		System.out.println(sb);

	}

}
