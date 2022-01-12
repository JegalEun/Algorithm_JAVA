package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1912 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int []num=new int[n];
		int []dp = new int[n];
		
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		dp[0]=num[0];
		
		for(int i=1;i<n;i++) {
			dp[i]=Math.max(dp[i-1]+num[i], num[i]);
		}
		
		int max=dp[0];
		
		for(int i=0;i<n;i++) {
			if(max<dp[i]) {
				max=dp[i];
			}
		}
		
		System.out.println(max);

	}

}
