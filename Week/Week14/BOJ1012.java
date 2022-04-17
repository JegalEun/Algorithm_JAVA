package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1012 {
	
	static int m,n,k;
	static boolean visited[][];
	static int map[][];
	static int count;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T  = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());	// 가로길이
			n = Integer.parseInt(st.nextToken());	// 세로길이
			k = Integer.parseInt(st.nextToken());
			
			count=0;
			
			map = new int[m][n];
			visited = new boolean[m][n];
			
			
			for(int j=0;j<k;j++) {
				st = new StringTokenizer(br.readLine());
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				map[a][b]=1;
			}
			
			for(int k=0;k<m;k++) {
				for(int z=0;z<n;z++) {
					if(map[k][z]==1 && !visited[k][z]) {
						dfs(k,z);
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
	}
	
	public static void dfs(int x, int y) {
		
		visited[x][y]=true;
		
		for(int i=0;i<4;i++) {
			int new_x = x+dx[i];
			int new_y = y+dy[i];
			
			if(new_x>=0 && new_y>=0 && new_x<m && new_y<n) {
				if(map[new_x][new_y]==1 && !visited[new_x][new_y]) {
					dfs(new_x,new_y);
				}
			}
		}
	}

}
