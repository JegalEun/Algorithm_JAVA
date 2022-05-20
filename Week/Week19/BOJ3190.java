package Week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ3190 {
	
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};		// 동남서북
	static int n;
	static int num;
	static int map[][];
	static String baam[][];
	static int time=0;
	static List<int[]> snake;
	static HashMap<Integer, String> hm = new HashMap<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n+1][n+1];
		num = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int temp_x = Integer.parseInt(st.nextToken());
			int temp_y = Integer.parseInt(st.nextToken());
			
			map[temp_x][temp_y]=1;
			// 사과가 있는 곳에 1삽입
		}
		
		// 뱀 방향 정보 입력
		int number = Integer.parseInt(br.readLine());
		baam = new String[number][2];
		for(int i=0;i<number;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String t = st.nextToken();
			String r = st.nextToken();
			hm.put(Integer.parseInt(t), r);
		}
		
		// 뱀시작지점 (1,1)
		snake = new LinkedList<>();
		snake.add(new int[] {1,1});
		
		int new_x;
		int new_y;
		int x=1;
		int y=1;
		int dir=0;
		
		// 뱀 움직이기 시작
		while(true) {
			time++;
			
			new_x=x+dx[dir];
			new_y=y+dy[dir];
			
			if(finish(new_x, new_y)) {
				break;
			}
			
			if(map[new_x][new_y]==1) {
				map[new_x][new_y]=0;
				snake.add(new int[] {new_x,new_y});
				// 사과가 있다면 머리추가
			}else {
				snake.add(new int[] {new_x,new_y});	//머리 추가해주고
				snake.remove(0);
				// 꼬리 삭제
			}
			
			//x초가 끝난 뒤니까.. 뱀이 이동하고 난뒤에 방향 전환 
			x=new_x;
			y=new_y;
			
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
		}
		
		System.out.println(time);

	}
	
	static boolean finish(int x, int y) {
		// 범위에 벗어나거나
		if(x<1 || y<1 || x>=n+1 || y>=n+1) return true;
		
		// 몸통에 닿으면
		for(int i=0;i<snake.size();i++) {
			if(x==snake.get(i)[0] && y==snake.get(i)[1])
				return true;
		}
		
		return false;
	}

}
