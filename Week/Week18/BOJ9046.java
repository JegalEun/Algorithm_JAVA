package Week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9046 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int alpha[];
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			alpha = new int[26];
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)>='a' && s.charAt(j)<='z') {
					// 소문자일 경우
					int temp = s.charAt(j)-'a';
					alpha[temp]++;
				}
			}
			
			int max = -1;
			for(int k=0;k<alpha.length;k++) {
				if(alpha[k]>max) {
					max=alpha[k];
				}
			}
			
			int count=0;
			int answer=0;
			for(int z=0;z<alpha.length;z++) {
				if(max==alpha[z]) {
					count++;
					answer=z;
				}
			}
			
			char c = (char)(answer+'a');
			
			if(count>=2) {
				sb.append("?"+"\n");
			}else {
				sb.append(c+"\n");
			}
		}
		
		System.out.println(sb.toString());

	}

}
