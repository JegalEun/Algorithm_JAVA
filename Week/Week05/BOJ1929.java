package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1929 {
	
	static boolean [] flag;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		String [] nums = input.split(" ");
		
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		
		flag = new boolean[b+1];
		
		get_prime();
		
		for(int i=a;i<=b;i++) {
			if(!flag[i]) {
				sb.append(i+"\n");
			}
		}
		
		System.out.println(sb);

	}
	
	static void get_prime() {
		
		//false=소수, true=소수아님.
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
