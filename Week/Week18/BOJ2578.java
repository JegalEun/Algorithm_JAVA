package Week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2578 {
	
	static int map[][] = new int[5][5];
	static int bingoCount=0;
	static int cnt=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 내 답
		for(int i=0;i<5;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		// 정답
		for(int i=0;i<5;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<5;j++) {
				bingoCount=0;
				int ans = Integer.parseInt(st.nextToken());
				cnt++;
				bingo(ans);
				check();
				
				if(bingoCount>=3) {
					System.out.println(cnt);
					return;
				}
			}
		}
		
	}
	
	public static void bingo(int num) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(map[i][j]==num) {
					map[i][j]=-1;
				}
			}
		}
	}
	
	public static void check() {
		
		//행체크
		for(int i=0;i<5;i++) {
			int c=0;
			for(int j=0;j<5;j++) {
				if(map[i][j]==-1) {
					c++;
				}
			}
			if(c==5) {
				bingoCount++;
			}
		}
		
		//열체크
		for(int i=0;i<5;i++) {
			int c=0;
			for(int j=0;j<5;j++) {
				if(map[j][i]==-1) {
					c++;
				}
			}
			if(c==5) bingoCount++;
		}
		
		//왼쪽->오른쪽
		int c=0;
		for(int i=0;i<5;i++) {
			if(map[i][i]==-1) {
				c++;
			}
		}
		
		if(c==5) bingoCount++;
		
		int d=0;
		// 오른쪽->왼쪽
		for(int i=0;i<5;i++) {
			if(map[i][4-i]==-1) {
				d++;
			}
		}
		
		if(d==5) bingoCount++;
	}

}
