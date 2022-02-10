package Week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14888 {
	
	static int oper[]= new int[4];
	static int a[];
	static int max=Integer.MIN_VALUE;
	static int min=Integer.MAX_VALUE;
	static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<4;i++) {
			oper[i]=Integer.parseInt(st.nextToken());
		}
		
		dfs(a[0],1);
		
		System.out.println(max);
		System.out.println(min);
		
		
	}
	
	static void dfs(int num, int index) {
		
		if(n==index) {
			
			max=Math.max(num, max);
			min=Math.min(num, min);
			return;
		}
		
		else {
			
			for(int i=0;i<4;i++) {
				if(oper[i]>0) {
					
					oper[i]--;
					
					switch(i) {
					
					case 0 : dfs(num+a[index], index+1); break;
					case 1 : dfs(num-a[index], index+1); break;
					case 2 : dfs(num*a[index], index+1); break;
					case 3 : dfs(num/a[index], index+1); break;
					
					}
					
					oper[i]++;
					// 다시 연산자 개수 복구
				}
			}
		}
	}
	


}
