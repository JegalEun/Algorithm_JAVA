package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int []input = new int[num];
		
		int index=0;
		while(st.hasMoreTokens()) {
			input[index]=Integer.parseInt(st.nextToken());
			index++;
		}
		
		int result=0;
		
		for(int i=0;i<num;i++) {
			int count=0;
			for(int j=1;j<=input[i];j++) {
				if(input[i]%j==0) {
					count++;
				}
			}
			
			if(count==2) {
				result++;
			}
		}
		
		System.out.println(result);
		
		
	}

}
