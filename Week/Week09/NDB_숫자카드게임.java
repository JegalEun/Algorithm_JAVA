package Week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NDB_숫자카드게임 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int map[][]=new int[n][m];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int ans=0;
		
		for(int i=0;i<n;i++) {
			int min=map[i][0];
			for(int j=0;j<m;j++) {
				if(min > map[i][j]) {
					// 행에서 가장 작은 숫자 추출
					min=map[i][j];
				}
			}
			ans=Math.max(min,ans);
		}
		
		System.out.println(ans);
	}

}
