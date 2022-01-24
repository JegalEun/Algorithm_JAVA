package Week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1476 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int i=1;
		int j=1;
		int k=1;
		int year=1;
		
		while(true) {
	
			if(i==16) {
				i=1;
			}if(j==29) {
				j=1;
			}if(k==20) {
				k=1;
			}
			
			if(i==e && j==s && k==m) {
				System.out.println(year);
				break;
			}
			
			
			i++;
			j++;
			k++;
			year++;
		}

	}

}

