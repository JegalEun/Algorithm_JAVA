package Week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1149 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int dp[][] = new int[n+1][4];
		int arr[][] = new int[n+1][4];
		
		for(int i=1;i<=n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1;j<=3;j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		dp[1][1] = arr[1][1];
		dp[1][2] = arr[1][2];
		dp[1][3] = arr[1][3];
		
		for(int i=2;i<=n;i++) {
			dp[i][1]=Math.min(dp[i-1][2], dp[i-1][3])+arr[i][1];	// 빨간집 칠하는 데 최소비용
			dp[i][2]=Math.min(dp[i-1][1], dp[i-1][3])+arr[i][2];	// 초록집 칠하는 데 최소비용
			dp[i][3]=Math.min(dp[i-1][1], dp[i-1][2])+arr[i][3];	// 파란집 칠하는 데 최소비용
		}
		
		System.out.println(Math.min(dp[n][1], Math.min(dp[n][2], dp[n][3])));
	}

}
