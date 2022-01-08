package Week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9095 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int []dp=new int[12];
		
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for(int i=4;i<=11;i++) {
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
		
		int m = Integer.parseInt(br.readLine());
		
		for(int i=0;i<m;i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n]+"\n");
		}
		
		System.out.println(sb);
		
	}

}
