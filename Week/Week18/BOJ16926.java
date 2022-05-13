package Week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16926 {
	
	static int map[][];
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
 		
		// 배열에 값 넣기
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		// 돌려야하는 그룹개수
		int group_count = Math.min(m, n)/2;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<group_count;j++) {
				int x=j;
				int y=j;
				int temp = map[x][y];
				
				int idx=0;
				
				while(idx < 4) {
					int new_x = x+dx[idx];
					int new_y = y+dy[idx];
					
					if(new_x>=j && new_x<n-j && new_y>=j && new_y<m-j) {
						map[x][y]=map[new_x][new_y];
						x=new_x;
						y=new_y;
					}else {
						idx++;
					}
				}
				map[j+1][j]=temp;
				
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
