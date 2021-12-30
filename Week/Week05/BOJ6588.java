package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ6588 {
	
	static boolean [] flag = new boolean[1000000+1];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean isTrue;

		param();		// 소수 판별
		
		while(true) {
			String input = br.readLine();
			int num  = Integer.parseInt(input);
			
			if(num==0) {
				break;
			}
			
			int a=0;
			int b=0;
			isTrue=false;
			
			for (int i=3;i<flag.length;i++) {
				
				if(!flag[i]) {
					int minus = num-i;
					if(!flag[minus]) {
						a=i;
						b=minus;
						sb.append(num+" = "+a+" + "+b+"\n");
						isTrue=true;
						break;
					}
				}
			}
			if(!isTrue) {
				sb.append("Goldbach's conjecture is wrong."+"\n");
			}
			
		}
		System.out.println(sb);
	}
	
	static void param() {
		
		flag[0]=flag[1]=true;
		
		for(int i=2;i<Math.sqrt(flag.length);i++) {
			if(flag[i]) {
				continue;
			}
			for(int j=i*i;j<flag.length;j+=i) {
				flag[j]=true;
			}
		}
	}

}
