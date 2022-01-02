package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ17087 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		
		String input = br.readLine();
		String ss[] = input.split(" "); 
		
		int dis[] = new int[n];		// 거리
		int result=0;
		
		for(int i=0;i<n;i++) {
			int a=Integer.parseInt(ss[i]);
			dis[i]=Math.abs(s-a);
		}

		int  d = dis[0];
		for(int i=1;i<dis.length;i++) {
			d=gcd(d,dis[i]);
		}
		
		System.out.println(d);
	}
	
	static int gcd(int a, int b) {
		
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		
		return a;
	}

}
