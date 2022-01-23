package Week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NDB_문자열뒤집기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int num[]=new int[s.length()];
		
		for(int i=0;i<s.length();i++) {
			num[i]=s.charAt(i)-'0';
		}
		
		int one=0;
		int zero=0;
		
		int a = num[0];
		
		for(int i=1;i<num.length;i++) {
			if(num[i]!= a) {
				if(a==0) {
					zero++;
					a=num[i];
				}else {
					one++;
					a=num[i];
				}
			}
		}
		
		if(a==0) zero++;
		else one++;
		
		System.out.println(Math.min(zero, one));

	}

}
