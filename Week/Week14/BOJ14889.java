package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14889 {
	
	static int n;
	static int map[][];
	static boolean isVisited[];
	static int min=Integer.MAX_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map=new int[n][n];
		isVisited=new boolean[n];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<n;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		team(0,0);
		System.out.println(min);
		

	}
	
	static void team(int depth, int length) {
		if(length==n/2) {
			// 팀은 짜졌고, 스타트팀, 링크팀 차이 구하기
			diff();
			return;
		}else {
			for(int i=depth;i<n;i++) {
				if(!isVisited[i]) {
					isVisited[i]=true;
					team(i+1,length+1);
					isVisited[i]=false;
				}
			}
		}
	}
	
	
	//	차이 구하기
	static void diff() {
		int start=0;
		int link=0;
		int gap=0;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(isVisited[i]&& isVisited[j]) {
					// 스타트팀이면 
					start+=map[i][j];
					start+=map[j][i];
				}else if(!isVisited[i] && !isVisited[j]){
					link+=map[i][j];
					link+=map[j][i];
				}
			}
		}
		
		// 차이 절댓값
		gap = Math.abs(start-link);
		
		if(gap==0) {
			System.out.println("0");
			System.exit(0);
		}
		// 최솟값 구하기
		min= Math.min(gap, min);
		
	}

}
