package Week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14503 {
	
	static int map[][];
	static int dx[] = {-1,0,1,0};	// 북동남서
	static int dy[] = {0,1,0,-1};
	static int n;
	static int m;
	static int count=1;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
			
		st = new StringTokenizer(br.readLine());	
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int dir = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());		
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		// 다시 돌아가는 것이 아니리라..
		dfs(x, y, dir);
		System.out.println(count);
	}
	
	public static void dfs(int x, int y, int dir) {
		
		map[x][y]=2;
		
		for(int i=0;i<4;i++) {
			// 왼쪽으로 돌고 벽이 아니면 직진
			dir-=1;
			if(dir==-1) dir=3;
			int new_x = x+dx[dir];
			int new_y = y+dy[dir];
			
			if(new_x>=0 && new_y>=0 && new_x<n && new_y<m) {
				if(map[new_x][new_y]==0) {
					// 전진하기
					count++;
					dfs(new_x,new_y, dir);
					// 원래같으면 다시 돌아와서 다른 곳 찾아야하지만 후진밖에 안되기때문에
					return;
				}
			}
		}
		
		int d = (dir+2)%4;	// 후진방향
		int back_x = x+dx[d];
		int back_y = y+dy[d];
		if(back_x >=0 && back_y>=0 && back_x<n && back_y<m) {
			if(map[back_x][back_y]!=1) {
				// 후진한게 벽이 아니라면
				dfs(back_x,back_y, dir);
				// 후진할 때 방향유지
			}
		}
	}
}
