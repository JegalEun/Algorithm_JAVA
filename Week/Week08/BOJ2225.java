package Week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2225 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		final int mod=1000000000;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int [][]dp = new int[201][201];
		
		for(int i=1;i<=K;i++) {
			dp[i][0]=1;
		}
		
		for(int i=0;i<=9;i++) {
			dp[1][i]=1;
		}
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=K;j++) {
				dp[j][i]= (dp[j][i-1]+dp[j-1][i])%mod;
			}
		}
		
		System.out.println(dp[K][N]);
	}

}
