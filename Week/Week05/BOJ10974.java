package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10974 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());

		int [] arr = new int[num];
		int [] output = new int[num];
		boolean [] visit = new boolean[num];
		
		for(int i =0;i<num;i++) {
			arr[i]=i+1;
		}
		
		perm(arr, output, visit, 0, num, num);
	}
	
	// 순서를 지키면서 n 개중에서 r개를 뽑는 경우
	public static void perm(int[] arr, int[] output, boolean[] visit, int depth, int num, int r) {
		if(depth==r) {
			print(output,r);
			return;
		}
		
		for(int i=0;i<num;i++) {
			if(visit[i]!=true) 	{// 방문하지 않았다면
				visit[i]=true;
				output[depth]=arr[i];
				System.out.println("depth "+depth+" arr[i] "+arr[i]);
				perm(arr, output, visit, depth + 1, num, r);    // 재귀
				visit[i]=false;
			}
		}
	}
	
	static void print(int[] output, int r) {
		for(int i=0;i<r;i++) {
			System.out.print(output[i]+" ");
		}
		System.out.println("");
	}

}
