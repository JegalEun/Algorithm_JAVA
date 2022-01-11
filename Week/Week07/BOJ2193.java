package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2193 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	
		long dp[][] = new long[n+1][2];
		
		dp[1][0]=0;
		dp[1][1]=1;
		
		for(int i=2;i<=n;i++) {
			for(int j=0;j<2;j++) {
				if(j==0) {
					dp[i][j]=dp[i-1][j+1]+dp[i-1][j];
				}else {
					dp[i][j]=dp[i-1][0];
				}

			}
		}
		
		long ans=0;
		
		for(int i=0;i<2;i++) {
			ans+=dp[n][i];
		}
		
		System.out.println(ans);

	}

}
