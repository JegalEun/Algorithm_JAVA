package Week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2667 {
	
	static int map[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static boolean visited[][];
	static int n;
	static int human_cnt=0;
	static int home_count=0;
	static ArrayList<Integer> ans = new ArrayList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			for(int j=0;j<n;j++) {
				map[i][j]=s.charAt(j)-'0';
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(!visited[i][j] && map[i][j]==1)
					home_count++;
					bfs(i,j);	
			}
		}
		
		System.out.println(home_count);
		
		Collections.sort(ans);
		
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
		
		
	}
	
	static class Node {
		int x;
		int y;
		
		public Node(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	
	static void bfs(int x, int y) {
		
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x,y));
		visited[x][y]=true;
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			
			for(int i=0;i<4;i++) {
				int new_x = temp.x + dx[i];
				int new_y = temp.y + dy[i];
				
				if(new_x < n && new_x >=0 && new_y < n && new_y >= 0) {
					if(map[new_x][new_y] != 0 && !visited[new_x][new_y]) {
						human_cnt++;
						// 사람수 추가
						q.offer(new Node(new_x,new_y));
						visited[new_x][new_y]=true;
					}
				}
			}
		}
		ans.add(human_cnt);
		human_cnt=0;
	}
	

}
