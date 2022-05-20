package Week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1748 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int[][] map = new int[N][M];
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				min = Math.min(min, map[i][j]);
				max = Math.max(max, map[i][j]);
			}
		}
		
		int real_time_min=Integer.MAX_VALUE;
		int real_height=0;
		for(int i=min;i<=max;i++) {
			int block = B;
			int time = 0;
			
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					int gap = map[j][k]-i;
					
					if(gap>0) {
						//클 경우 인벤토리에 넣어야한다.
						time+=Math.abs(gap)*2;
						block+=Math.abs(gap);
					}else if(gap<0) {
						// 작을 경우 인벤토리에서 빼서 채워야한다.
						time+=Math.abs(gap);
						block-=Math.abs(gap);
					}
				}
			}
			if(block<0) continue;
			// 블럭이 없다는 얘기는 높이를 조금더 키워야함.
			if(real_time_min >= time) {
				real_time_min=time;
				real_height=i;
			}
		}

		System.out.println(real_time_min+" "+real_height);
		
	}
}
