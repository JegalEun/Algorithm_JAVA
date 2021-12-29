package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10819 {
	
	static int max=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int numbers[]=new int[num];		// 각 숫자 집어넣기.
		int arr[] = new int[num];		// 순열 배열
		boolean visited[] = new boolean[num];
		
		int index=0;
		while(st.hasMoreTokens()) {
			numbers[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		max(numbers, arr, visited, 0, num, num);
		
		System.out.println(max);
		
	}
	
	static void max(int numbers[],int arr[], boolean visited[], int depth, int n, int r) {
		
		if(depth==r) {
			int sum=0;
			for(int i=0;i<n-1;i++) {
				sum+=Math.abs(arr[i]-arr[i+1]);
			}
			max=Math.max(max, sum);
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(visited[i]!=true) {
				visited[i]=true;
				arr[depth]=numbers[i];
				max(numbers, arr, visited, depth+1, n, r);
				visited[i]=false;
			}
		}
	}

}
