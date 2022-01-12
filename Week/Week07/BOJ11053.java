package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long [] num= new long[n];
		long [] dp = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<n;i++) {
			dp[i]=1;
			
			for(int j=0;j<i;j++) {
				if(num[i]>num[j] && dp[i]<dp[j]+1) {
					dp[i]=dp[j]+1;
				}
			}
		}
		
		long max=0;
		for(int i=0;i<n;i++) {
			if(dp[i]>max) {
				max=dp[i];
			}
		}
		
		System.out.println(max);

	}

}
