package Week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2468 {

	static int n;
	static int map[][];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static boolean visited[][];
	static int cnt=0;
	static int answer=0;
	static int max=0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		visited = new boolean[n][n];
		map = new int[n][n];
		
		int height = 0;
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				if(map[i][j]>height) {
					height=map[i][j];
					// 웅덩이 중 가장 높은 웅덩이 찾기
				}
			}
		}
		for(int h=0;h<height;h++) {
			visited = new boolean[n][n];
			cnt=0;
			// 다시 초기화
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(!visited[i][j] && map[i][j] > h) {
						bfs(i,j,h);
						cnt++;
					}
				}
			}
			max=Math.max(cnt, max);
		}
		
		System.out.println(max);
	}
	
	public static void bfs(int x,int y, int h) {
		
		Queue<Node> q = new LinkedList<>();
		visited[x][y]=true;
		q.offer(new Node(x,y));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			
			for(int i=0;i<4;i++) {
				int new_x = node.x+dx[i];
				int new_y = node.y+dy[i];
				
				if(new_x>=0 && new_y >= 0 && new_x<n && new_y<n) {
					if(!visited[new_x][new_y] && map[new_x][new_y] > h) {
						q.offer(new Node(new_x,new_y));
						visited[new_x][new_y]=true;
					}
				}
			}
		}
	}
	
	public static class Node {
		int x;
		int y;
		
		public Node(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}

}
