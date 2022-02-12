package Week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4963 {
	
	static int map[][];
    static int[] dx = {1, -1, 0, 0, -1, 1, -1, 1};
    static int[] dy = {0, 0, 1, -1, -1, 1, 1, -1};
	static boolean[][] visited;
	static int w;
	static int h;
	static int count;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			count=0;
			
			map = new int[h][w];
			visited = new boolean[h][w];
			
			if(w==0 && h==0) break;
			
			for(int i=0;i<h;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<w;j++) {
					map[i][j]=Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(map[i][j]!=0 && !visited[i][j]){
						dfs(i,j);
						count++;
					}
					
				}
			}
			
			System.out.println(count);
		}

	}
	
	static void dfs(int x, int y) {
		
		visited[x][y]=true;
		
		for(int i=0;i<8;i++) {
			int new_x = x+dx[i];
			int new_y = y+dy[i];
			
			if(new_x>=0 && new_x < h && new_y >= 0 && new_y < w) {
				if(map[new_x][new_y]!=0 && !visited[new_x][new_y]) {
					dfs(new_x, new_y);
				}
			}
		}
	}

}
