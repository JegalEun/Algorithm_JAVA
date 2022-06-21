package Week23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		
		int num[][] = new int[n][2];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num[i][0]=Integer.parseInt(st.nextToken());	// 몸무게
			num[i][1]=Integer.parseInt(st.nextToken());	// 키
		}
		
		for(int i=0;i<n;i++) {
			int rank=1;
			for(int j=0;j<n;j++) {
				if(num[i][0] < num[j][0] && num[i][1] < num[j][1]) {
					rank++;
				}else if(i==j) continue;
			}
			sb.append(rank+" ");
		}
		
		System.out.println(sb.toString());
	}

}
