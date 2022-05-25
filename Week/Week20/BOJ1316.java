package Week20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count=0;
		
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			boolean[] alpha = new boolean[26];
			boolean flag = true;
			
			for(int j=0;j<s.length();j++) {
				if(alpha[s.charAt(j)-'a']) {
					// 한번 나왔던 알파벳이라면
					if(s.charAt(j) != s.charAt(j-1)) {
						// 연속되지 않는다면
						flag=false;
					}
				}else {
					alpha[s.charAt(j)-'a']=true;
				}
			}
			if(flag) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
