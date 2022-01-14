package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {
	
	static int[][]map;
	static int n;
	static int m;
	static boolean [][]visited;
	static int []dx = {1,-1,0,0};
	static int []dy = {0,0,1,-1};

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			for(int j=0;j<m;j++) {
				map[i][j]=s.charAt(j)-'0';
			}
			
		}
		
		bfs(new Node(0,0));
		//	0,0 에서 출발
		
		System.out.println(map[n-1][m-1]);

	}
	
	
	static class Node {
		int x;
		int y;
		
		public Node(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	
	static void bfs(Node node) {
		
		Queue<Node> queue = new LinkedList<>();
		visited[node.x][node.y]=true;
		queue.offer(node);
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			for(int i=0;i<4;i++) {
				int new_x = temp.x+dx[i];
				int new_y = temp.y+dy[i];
				
				if(new_x<n && new_y<m && new_x>=0 && new_y>=0) {
					// 범위에 벗어나지 않고
					if(!visited[new_x][new_y] && map[new_x][new_y]!=0) {
						//0이 아니면서 방문한 적이 없으면
						queue.offer(new Node(new_x, new_y));
						visited[new_x][new_y]=true;
						map[new_x][new_y]=map[temp.x][temp.y]+1;
						// 지나온 횟수 +1해주기
					}
				}
				
			}

			
		}
	}

}

