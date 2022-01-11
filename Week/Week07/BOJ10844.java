package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10844 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		final int mod = 1000000000;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long [][] dp = new long[n+1][10];
		
		for(int i=1;i<=9;i++) {
			dp[1][i]=1;		// 길이가 1인 경우의 수 넣어주기
		}
		
		for(int i=2;i<=n;i++) {
			for(int j=0;j<=9;j++) {
				if(j==0) {
					dp[i][j]=dp[i-1][j+1]%mod;
				}else if(j==9) {
					dp[i][j]=dp[i-1][j-1]%mod;
				}
				else {
					dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%mod;
				}
			}
		}
		
		long ans=0;
		
		for(int i=0;i<=9;i++) {
			ans+=dp[n][i];
		}
		
		System.out.println(ans%mod);

	}

}
