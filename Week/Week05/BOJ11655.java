package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11655 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			int a;
			
			if(65<=c && c<=90) {		// 대문자일 경우
				a=c+13;
				if(a>90) {
					a=a-26;
					c=(char)a;
					sb.append(c);
				}else {
					c=(char)a;
					sb.append(c);
				}
			}else if(97<=c && c<=122) {
				a=c+13;
				if(a>122) {
					a=a-26;
					c=(char)a;
					sb.append(c);
				}else {
					c=(char)a;
					sb.append(c);
				}
			}else if(c==' ') {
				sb.append(" ");
			}else {
				sb.append(c);
			}
		}
		
		System.out.println(sb);

	}

}
