package Week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NDB_음료수얼려먹기 {
	
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static boolean visited[][];
	static int map[][];
	static int n;
	static int m;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[n][m];
		map = new int[n][m];
		int count=0;
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			for(int j=0;j<m;j++) {
				map[i][j]=s.charAt(j)-'0';
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(!visited[i][j] && map[i][j]==0) {
					dfs(i,j);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	static void dfs(int x,int y) {
		
		visited[x][y]=true;
		
		for(int i=0;i<4;i++) {
			int new_x = x+dx[i];
			int new_y = y+dy[i];

			if(new_x < n && new_x >= 0 && new_y < m && new_y >= 0) {
				if(map[new_x][new_y]==0 && !visited[new_x][new_y]) {
					dfs(new_x, new_y);
				}
			}
		}
	}

}
