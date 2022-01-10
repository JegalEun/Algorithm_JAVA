package Week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16194 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new  StringTokenizer(br.readLine());
		
		int p[]=new int[n+1];
		int dp[]=new int[n+1];
		
		for(int i=1;i<=n;i++) {
			p[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=1;i<=n;i++) {
			dp[i]=p[i];	// 초기화
			for(int j=1;j<=i;j++) {
				dp[i]=Math.min(dp[i], p[j]+dp[i-j]);
			}
		}
		
		System.out.println(dp[n]);
	}

}
