package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9613 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<n;i++) {
			
			String ss = br.readLine();

			long result=0;
			
			String []input = ss.split(" ");
			int num = Integer.parseInt(input[0]);
			int arr[]=new int[num];
			
			for(int j=1;j<=num;j++) {
				arr[j-1]=Integer.parseInt(input[j]);
			}
			
			for(int j=0;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					result+=gcd(arr[j],arr[k]);
				}
			}
			sb.append(result+"\n");
			
		}
		
		System.out.println(sb);
	}
	
	static int gcd(int a,int b) {
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}

}
