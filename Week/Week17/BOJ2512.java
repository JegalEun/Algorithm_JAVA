package Week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2512 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		long left = 0;
		long right = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			right=Math.max(arr[i],right);
		}
		
		long m = Integer.parseInt(br.readLine());
		
		while(left<=right) {
			
			long mid = (left+right)/2;
			int sum=0;
			for(int i=0;i<n;i++) {
				if(mid>arr[i]) sum+=arr[i];
				else sum+=mid;
			}
			if(sum>m) {
				// 예산보다 클 경우 mid를 낮춰야한다. 
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		
		System.out.println(left-1);

	}

}
