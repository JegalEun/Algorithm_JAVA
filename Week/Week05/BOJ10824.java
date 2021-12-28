package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10824 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long ab=0;
		long cd=0;
		
		while(st.hasMoreTokens()) {
			String a = st.nextToken();
			String b = st.nextToken();
			String c = st.nextToken();
			String d = st.nextToken();
			
			ab = Long.parseLong(a+b);
			cd = Long.parseLong(c+d);
			
		}
		
		System.out.println(ab+cd);
		
		
	}

}
