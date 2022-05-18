package Week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int num[][]=new int[n][2];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			num[i][0]=a;
			num[i][1]=b;
			
		}
		
		
		// 끝나는 시간 기준 오름차순 정렬
		Arrays.sort(num, (o1, o2) -> {
			if(o1[1]==o2[1]) {
				// 끝나는 시간이 같으면
				return o1[0]-o2[0];
			}else {
				return o1[1]-o2[1];
			}
		});
		
		int count=0;
		int time=0;
		for(int i=0;i<n;i++) {
			if(time<=num[i][0]) {
				// 시작하는 시간이 끝나는 시간보다 클 경우
				time=num[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	}

}
