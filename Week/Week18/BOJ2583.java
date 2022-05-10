package Week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ2583 {
	
	static int map[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int m;
	static int n;
	static int cnt=0;
	static boolean visited[][];
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int answer = 0;
		ArrayList<Integer> arr = new ArrayList<>();
		
		map = new int[m][n];
		visited = new boolean[m][n];
		
		// 직사각형 칠하기
		for(int i=0;i<k;i++) {
			st = new StringTokenizer(br.readLine());
			
			int left_x = Integer.parseInt(st.nextToken());
			int left_y = Integer.parseInt(st.nextToken());
			int right_x = Integer.parseInt(st.nextToken());
			int right_y = Integer.parseInt(st.nextToken());
			
			for(int j=left_y;j<right_y;j++) {
				for(int z=left_x;z<right_x;z++) {
					map[j][z]=1;
				}
			}		
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(!visited[i][j] && map[i][j]!=1) {
					cnt=1;
					int c=dfs(i,j);
					arr.add(c);
					answer++;
				}
			}
		}
		Collections.sort(arr);
		System.out.println(answer);
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
	}
	
	public static int dfs(int x, int y) {
		
		visited[x][y]=true;
		
		for(int i=0;i<4;i++) {
			int new_x = x+dx[i];
			int new_y = y+dy[i];
			
			if(new_x >= 0 && new_y >=0 && new_x < m && new_y < n) {
				if(!visited[new_x][new_y] && map[new_x][new_y]!=1) {
					cnt++;
					dfs(new_x,new_y);
				}
			}
		}
		return cnt;
	}

}
