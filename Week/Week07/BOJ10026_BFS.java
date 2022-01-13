package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ10026 {
	
	static int n;
	static char map[][];
	static boolean visited[][];
	static int dx[]= {0,1,-1,0};
	static int dy[]= {-1,0,0,1};
	
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
					bfs(new Node(i,j));
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
					bfs(new Node(i,j));
					cnt++;
				}
			}
		}
		
		int abnormal_cnt=cnt;
		System.out.println(noraml_cnt+" "+abnormal_cnt);
		

	}
	
	static class Node {
		int x;
		int y;
		
		public Node(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	
	static void bfs(Node node) {
		
		Queue<Node> queue= new LinkedList<>();
		queue.offer(node);
		
		visited[node.x][node.y]=true;
		
		while(!queue.isEmpty()) {
			 Node temp = queue.remove();
			
			for(int i=0;i<4;i++) {
				int x = temp.x+dx[i];
				int y = temp.y+dy[i];
				
				if(x<0 || x>n || y<0 || y>n) {
					//	배열을 벗어나면
					continue;
				}
				
				if(!visited[x][y] && map[node.x][node.y]==map[x][y]) {
					// 방문하지 않았고 색이 똑같으면
					bfs(new Node(x,y));		
				}
			}
		}
		
	}

}
