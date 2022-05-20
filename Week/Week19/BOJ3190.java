package Week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ3190_re {
	
	static int n;
	static int map[][];
	static int dx[] = {0,1,0,-1};	// 동남서북
	static int dy[] = {1,0,-1,0};
	static List<int[]> list;
	static int time=0;
	static HashMap<Integer, String> hm = new HashMap<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		
		map = new int[n+1][n+1];
		
		// 사과 위치 1로 설정
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b]=1;
		}
		// 뱀의 방향정보 입력
		int number = Integer.parseInt(br.readLine());
		for(int i=0;i<number;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String b = st.nextToken();
			hm.put(a, b);
		}
		
		//1,1 부터 시작
		list = new LinkedList<>();
		list.add(new int[] {1,1});
		dfs(1,1,0);
		System.out.println(time);
		
	}
	
	static void dfs(int x,int y, int dir) {
		time++;
	
		int new_x = x+dx[dir];
		int new_y = y+dy[dir];
		
		if(finish(new_x, new_y)) {
			// 벽을 만나거나 뱀을 만나면 끝
			return;
		}
		
		if(map[new_x][new_y]==1) {
			// 사과를 만나면
			map[new_x][new_y]=0;
			list.add(new int[] {new_x, new_y});
			// 사과 먹고 머리 추가
		}else {
			// 사과가 없으면
			// 머리추가하고 꼬리 삭제
			list.add(new int[] {new_x, new_y});
			list.remove(0);
		}
		
		// 방향전환
		if(hm.containsKey(time)) {
			String d = hm.get(time);
			if(d.equals("L")) {
				dir--;
				if(dir==-1) dir=3;
			}else if(d.equals("D")) {
				dir++;
				if(dir==4) dir=0;	
			}
		}
		
		dfs(new_x,new_y,dir);
	}

	static boolean finish(int x, int y) {
		if(x<1 || y<1 || x>=n+1 || y>=n+1) {
			return true;
		}
		
		for(int i=0;i<list.size();i++) {
			if(x==list.get(i)[0] && y==list.get(i)[1]) {
				return true;
			}
		}
		
		return false;
	}

}
