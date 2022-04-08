package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2606 {
	
	static int node[][];
	static boolean visited[];
	static int point;
	static int line;
	static int count=0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		point = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		node = new int[point+1][point+1];
		visited = new boolean[point+1];
		
		for(int i=1;i<=line;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			node[n][m]=1;
			node[m][n]=1;
			
		}
		
		dfs(1);
		
		System.out.println(count);

	}
	
	static void dfs(int i) {
		visited[i]=true;
		
		for(int j=1;j<=point;j++) {
			if(visited[j]==false && node[i][j]==1) {
				count++;
				dfs(j);
			}
		}
	}

}
