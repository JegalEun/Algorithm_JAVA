package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1654 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		long len[] = new long[k];
		long left=1;
		long right=0;
	
		
		for(int i=0;i<k;i++) {
			len[i]=Long.parseLong(br.readLine());
			right=Math.max(right, len[i]);
		}
		
		while(left <= right) {
			long mid = (left+right)/2;
			long sum=0;
			
			for(int i=0;i<k;i++) {
				sum+=len[i]/mid;
			}
			
			if(sum >= n) {
				// 더  크게 잘라줘야함.
				left = mid+1;
			}else {
				right = mid-1;
			}
		}

		System.out.println(right);
	}

}
