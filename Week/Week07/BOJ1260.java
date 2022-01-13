package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1260 {
	
	static int [][] check;
	static boolean[] visited;
	static  int n;
	static int m;
	static int start;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		start=Integer.parseInt(st.nextToken());;
		
		check=new int[1001][1001];
		visited=new boolean[1001];
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			check[x][y]=check[y][x]=1;
		}
		
		dfs(start);
		sb.append("\n");
		visited=new boolean[1001];
		bfs(start);
		
		System.out.println(sb);

	}
	
	static void dfs(int i) {
		visited[i]=true;
		sb.append(i+" ");
		
		for(int j=1;j<=n;j++) {
			if(!visited[j] && check[i][j]==1) {
				dfs(j);
			}
		}
	}
	
	static void bfs(int i) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[i]=true;
		queue.add(i);
		
		while(!queue.isEmpty()) {
			int temp=queue.remove();
			
			sb.append(temp+" ");
			
			for(int j=1;j<=n;j++) {
				if(!visited[j] && check[temp][j]==1) {
					visited[j]=true;
					queue.add(j);
				}
			}
		}
	}

}
