package Week07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ13023 {

	static ArrayList<Integer>[] list;
	static boolean visited[];
	static int n;
	static int m;
	static int ans = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		list=new ArrayList[n];
		visited = new boolean[n];
		
		for(int i=0;i<n;i++) {
			//	연결리스트  초기화하고 생성
			list[i]=new ArrayList<Integer>();
		}
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
	
			//	연결리스트 노드생성
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i=0;i<n;i++) {
			visited = new boolean[n];
			dfs(i,0);
		}
		
		System.out.println("0");
	}
	
	static void dfs(int i, int depth) {
		
		if(depth==4) {
			System.out.println("1");
			System.exit(0);
		}
	
		visited[i]=true;
		
		for(int j : list[i]) {
			if(!visited[j]) {
				dfs(j,depth+1);
				visited[j]=false;
			}
		}
	}

}
