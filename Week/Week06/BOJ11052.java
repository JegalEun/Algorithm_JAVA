package Week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(br.readLine());
		int [] p = new int[n+1]; 
		int [] dp = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			p[i]=Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				dp[i] = Math.max(dp[i],p[j]+dp[i-j]);
			}
		}
		

	}

}
