package Week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1743 {
	
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int map[][];
	static boolean[][] visited;
	static int n;
	static int m;
	static int count=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int max = 0;
		
		map = new int[n+1][m+1];
		visited = new boolean[n+1][m+1];
		
		for(int i=0;i<k;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			map[x][y]=1;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(map[i][j]==1 && !visited[i][j]) {
					count=0;
					dfs(i,j);
					max = Math.max(max, count);
				}
			}
		}
		
		System.out.println(max);
	}
	public static void dfs(int x, int y) {
	
		count++;
		visited[x][y]=true;
		
		for(int i=0;i<4;i++) {
			int new_x = x+dx[i];
			int new_y = y+dy[i];
			
			if(new_x >0 && new_y >0 && new_x <= n && new_y <=m) {
				if(!visited[new_x][new_y] && map[new_x][new_y]==1) {
					// 방문안했고 1이면
					dfs(new_x, new_y);
				}
			}
		}
	}

}
