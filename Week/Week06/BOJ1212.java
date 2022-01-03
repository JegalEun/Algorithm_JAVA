package Week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1212 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String n = br.readLine();
		String s="";
		
		for(int i=0;i<n.length();i++) {
			String a = Integer.toBinaryString(n.charAt(i)-'0');
			
			if(a.length()%3==1 && i!=0) {
				sb.append("00").append(a);
			} else if(a.length()%3==2 && i!=0) {
				sb.append("0").append(a);
			} else {
				sb.append(a);
			}
			
		}
	
		System.out.println(sb);
		
	}

}
