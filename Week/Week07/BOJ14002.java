package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ14002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num[]=new int[n];
		int dp[]=new int[n];
		int temp[]=new int[n];
		
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<n;i++) {
			dp[i]=1;
			
			for(int j=0;j<n;j++) {
				if(num[i]>num[j] && dp[j]+1>dp[i]) {
					dp[i]=dp[j]+1;
					temp[i]=j;
				}
			}
		}
		
		
		int max=dp[0];
		for(int i=0;i<n;i++) {
			if(max<dp[i]) {
				max=dp[i];
			}
		}
		sb.append(max+"\n");
		
		Stack<Integer> stack = new Stack<>();
		// dp역추적
		for(int i=n-1;i>=0;i--) {
			if(dp[i]==max) {
				stack.push(num[i]);
				max--;
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop()+" ");
		}
		
		System.out.println(sb);

	}

}
