package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10026 {
	
	static int n;
	static char map[][];
	static boolean visited[][];
	static int dx[]= {-1,0,0,1};
	static int dy[]= {0,1,-1,0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map=new char[n+1][n+1];
		visited=new boolean[n+1][n+1];
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			for(int j=0;j<n;j++) {
				map[i][j]=s.charAt(j);		// 색 하나하나 쪼개서 넣어주기. R R R B B
			}
		}
		
		// 색약이 아닌 경우 count 세기
		int cnt = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(!visited[i][j]) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		
		int noraml_cnt=cnt;
		
		// 다시 초기화해주기
		cnt=0;
		visited=new boolean[n+1][n+1]; 	
		
		//색약인 경우 색을 구별못하므로 바꿔준다.
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j]=='G') {
					map[i][j]='R'; 	
					// G를 R로 바꾸어준다.
				}
			}
		}
		
		//색약인 경우 count세기
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(!visited[i][j]) {
					dfs(i,j);
					cnt++;
				}
			}
		}
		
		int abnormal_cnt=cnt;
		System.out.println(noraml_cnt+" "+abnormal_cnt);
		

	}
	
	static void dfs(int x, int y) {
		
		visited[x][y]=true;
		char tmp_char=map[x][y];		// R
		
		for(int i=0;i<4;i++) {
			int new_x=x+dx[i];
			int new_y=y+dy[i];
			
			if(new_x<0 || new_y<0 || new_x>n || new_y>n) {
				continue;
			}
			
			if(!visited[new_x][new_y] && map[new_x][new_y]==tmp_char) {
				dfs(new_x, new_y);
			}
		}
		
	}

}
