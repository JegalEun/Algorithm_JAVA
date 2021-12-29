package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2609 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String [] input2 = input.split(" ");
		int [] num = new int[input2.length];
		
		for(int i=0;i<num.length;i++) {
			num[i]=Integer.parseInt(input2[i]);
		}
		
		int c = gcd(num[0],num[1]);
		
		System.out.println(c);
		System.out.println(num[0]*num[1]/c);
		
		

	}
	
	static int gcd(int a, int b) {

		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		
		return a;
	}

}
