package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7576 {
	
	static int m;
	static int n;
	static int map[][];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static int result=0;
	static Queue<Node> q;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<m;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		q = new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==1) {
					// 익은토마토라면?
					// 큐에 넣기
					q.offer(new Node(i,j));
				}
			}
		}
		
		System.out.println(bfs());
		
	}
	
	public static int bfs() {
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			
			for(int i=0;i<4;i++) {
				int new_x = node.x+dx[i];
				int new_y = node.y+dy[i];
				
				if(new_x >= 0 && new_y >= 0 && new_x < n && new_y < m) {
					if(map[new_x][new_y]==0) {
						// 안익은 토마토라면
						q.offer(new Node(new_x,new_y));
						// 큐에 추가
						map[new_x][new_y] = map[node.x][node.y]+1;
						// 익은 날짜 추가
					}
				}
			}
			
		}
		
		int count = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==0) {
					return -1;
				}
				
				count = Math.max(count, map[i][j]);
				// 최댓값 구하기
			}
		}
		
		if(count==1)  result=0;
		// 다 익었을 경우
		else {
			result=count-1;
			// 걸린 일수는 최대 날짜에서 -1을 해야함
		}
		
		return result;
	}
	
	public static class Node {
    	int x;
    	int y;
    	
    	public Node(int x, int y) {
    		this.x=x;
    		this.y=y;
    	}
    }

}
