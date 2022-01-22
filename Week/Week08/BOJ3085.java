package Week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3085 {
	
	static int n;
	static char [][]map;
	static int max=0;
	static int count=1;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(br.readLine());
		map = new char[n][n];
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			for(int j=0;j<n;j++) {
				map[i][j]=s.charAt(j);
			}
		}
		
		// 가로로 인접한 두 사탕 교환하고 최대 사탕개수 구하기
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				char temp=map[i][j];
				map[i][j]=map[i][j+1];
				map[i][j+1]=temp;
				
				check();
				
				// 교환한 사탕 복구
				temp=map[i][j];
				map[i][j]=map[i][j+1];
				map[i][j+1]=temp;
			}
		}
		
		// 세로도 동일
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				char temp=map[j][i];
				map[j][i]=map[j+1][i];
				map[j+1][i]=temp;
				
				check();
				
				temp=map[j][i];
				map[j][i]=map[j+1][i];
				map[j+1][i]=temp;
			}
		}
		
		System.out.println(max);
	}
	
	// 가로, 세로로 비교
	public static void check() {
		
		//가로로 비교
		for(int i=0;i<n;i++) {
			count=1;
			for(int j=0;j<n-1;j++) {
				
				//  사탕이 다른 경우 초기화
				if(map[i][j]!=map[i][j+1]) {
					count=1;
				}
				// 사탕이 같은 경우 사탕 한개 먹기
				else {
					count++;
				}
				
				// 사탕 최대개수
				max = Math.max(count, max);
			}
		}
		
		//세로로 비교
		for(int i=0;i<n;i++) {
			count=1;
			for(int j=0;j<n-1;j++) {
				
				// 사탕이 다른 경우 초기화
				if(map[j][i]!=map[j+1][i]) {
					count=1;
				}
				// 사탕이 같은 경우 
				else {
					count++;
				}
				
				max = Math.max(count, max);
			}
		}
	}

}
