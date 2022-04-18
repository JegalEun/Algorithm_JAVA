package Week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11724 {
	
	static int n,m;
	static boolean[] visited;
	static int map[][];
	static int count=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		visited = new boolean [n+1];
		map = new int[n+1][n+1];
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b]=1;
			map[b][a]=1;
		}
		
		for(int i=1;i<=n;i++) {
			if(!visited[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void dfs(int start) {
		
		visited[start] = true;
		
		for(int i=1;i<=n;i++) {
			if(!visited[i] && map[start][i]==1) {
				// 방문한 적이 없고 연결되어있으면
				dfs(i);
			}
		}
	}

}
