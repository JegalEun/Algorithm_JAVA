package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15649 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[]=new int[n];
		int newArr[] = new int[n];		
		boolean visited[] = new boolean[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=i+1;
		}
		
		nm(arr, newArr, visited, 0, n, m);
		
		
	}
	
	static void nm(int arr[], int newArr[], boolean visited[], int depth, int n, int m) {
		
		for(int i=0;i<n;i++) {
			if(depth==m) {
				print(newArr, m);
				return;
			}else {
				if(!visited[i]) {
					visited[i]=true;
					newArr[depth]=arr[i];
					nm(arr, newArr, visited, depth+1, n, m);
					visited[i]=false;
				}
			
			}
		}
	}
	static void print(int newArr[], int m) {
		for(int i=0;i<m;i++) {
			System.out.print(newArr[i]+" ");
		}
		System.out.println();
	}

}
