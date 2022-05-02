package Week17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1013 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		String vega = "(100+1+|01)+";
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
	
			if(s.matches(vega)) System.out.println("YES");
			else System.out.println("NO");
		}

	}

}
