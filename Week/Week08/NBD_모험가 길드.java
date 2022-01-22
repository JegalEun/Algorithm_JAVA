package Week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class NDB_모험가길드 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Integer []x=new Integer[n];
		
		for(int i=0;i<n;i++) {
			x[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(x, Collections.reverseOrder());

		int count=x[0];
		int result=0;
		
		for(int i=0;i<n;++i) {
			if(count>i) {
				continue;
			}else {
				result++;
				count=x[i];
			}
		}
		
		System.out.println(result);
	}

}
