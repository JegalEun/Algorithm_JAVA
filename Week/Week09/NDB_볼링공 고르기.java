package Week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NDB_볼링공고르기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int weight[]=new int[n+1];
		for(int i=1;i<=n;i++) {
			weight[i]=Integer.parseInt(st.nextToken());
		}
		
		int count=0;
		
		for(int i=1;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				if(weight[i]==weight[j]) continue;
				count++;
				
			}
		}
		
		System.out.println(count);

	}

}
