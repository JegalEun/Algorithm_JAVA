package Week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NDB_미로탈출 {
	
	static int map[][];
	static int dx[]= {-1,1,0,0};
	static int dy[]= {0,0,-1,1};
	static int n;
	static int m;
	static int count=0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			for(int j=0;j<m;j++) {
				map[i][j]=s.charAt(j)-'0';
			}
		}
		
		System.out.println(bfs(0,0));

	}
	
	static class Node {
		int x;
		int y;
		
		Node(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
	
	static int bfs(int x, int y) {
		
		Queue<Node> queue = new LinkedList<>();
		queue.offer(new Node(x, y));
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			for(int i=0;i<4;i++) {
				int new_x = temp.x+dx[i];
				int new_y = temp.y+dy[i];
				
				if(new_x < n && new_x >= 0 && new_y >= 0 && new_y < m) {
					if(map[new_x][new_y]==1) {
						map[new_x][new_y]=map[temp.x][temp.y]+1;
						queue.offer(new Node(new_x, new_y));
					}
				}
			}
		}
		return map[n-1][m-1];
	}
}
