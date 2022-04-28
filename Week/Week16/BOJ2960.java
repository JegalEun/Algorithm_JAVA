package Week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2960 {
	
	static boolean visited[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		visited = new boolean[n+1];
		
		int answer = solve(n,k);
		System.out.println(answer);
	
	}
	public static int solve(int n, int k) {
		int count=0;
		
		for(int i=2;i<=n;i++) {
			for(int j=i;j<=n;j=j+i) {
				if(!visited[j]) {
					count++;
					visited[j]=true;
				}
				if(count==k) {
					return j;
				}
			}
		}
		return 0;
	}
}
