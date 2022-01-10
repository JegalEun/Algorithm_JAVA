package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15990 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		final int mod = 1000000009;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		long [][]dp = new long[100001][4];
		
		dp[1][1]=1;
		dp[2][2]=1;
		dp[3][1]=1;
		dp[3][2]=1;
		dp[3][3]=1;
		
		for(int i=4;i<=100000;i++) {
			dp[i][1]=dp[i-1][2]+dp[i-1][3]%mod;
			dp[i][2]=dp[i-2][1]+dp[i-2][3]%mod;
			dp[i][3]=dp[i-3][1]+dp[i-3][2]%mod;
	
		}
		
		for(int i=0;i<n;i++) {
			int input = Integer.parseInt(br.readLine());
			
			long ans = (dp[input][1]+dp[input][2]+dp[input][3])%mod;
			sb.append(ans+"\n");
			
		}
		
		System.out.println(sb);
	}

}
