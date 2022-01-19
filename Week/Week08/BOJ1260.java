package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1260_list {
	
	static int n,m;
	static ArrayList<Integer>[] nodelist;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		nodelist = new ArrayList[n+1];		// 정점수대로 배열 생성
		visited = new boolean[n+1];			// 정점은 1번부터 시작하므로 +1
		
		
		for(int i=0;i<nodelist.length;i++) {
			// 간선 리스트 초기화!
			// 초기화하지 않으면 오류가 난다.
			nodelist[i]=new ArrayList<Integer>();
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			// 양방향리스트이므로 각자 연결 리스트 생성해주기
			nodelist[from].add(to);
			nodelist[to].add(from);
		}
		
		for(int i=0;i<nodelist.length;i++) {
			Collections.sort(nodelist[i]);
			// 작은 것부터 방문해야하기때문에 오름차순으로 정렬
		}
		
		dfs(start);
		System.out.println("");
		Arrays.fill(visited, false);	//초기화해주기
		bfs(start);
		

	}
	
	static void dfs(int i) {
		
		visited[i]=true;
		System.out.print(i+" ");
		
		for(int e:nodelist[i]) {
			if(!visited[e]) {
				dfs(e);
			}
		}
	}
	
	static void bfs(int i) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(i);
		visited[i]=true;
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			System.out.print(temp+" ");
			
			for(int e:nodelist[temp]) {
				if(!visited[e]) {
					visited[e]=true;
					queue.add(e);
				}
			}
		}
	}

}
