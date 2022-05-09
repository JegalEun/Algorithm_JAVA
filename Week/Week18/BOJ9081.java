package Week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9081 {

	static char alpha[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for(int i=0;i<n;i++) {
			String s = br.readLine();
			alpha = s.toCharArray();
			
			if(nextPermutation()) {
				for(int j=0;j<alpha.length;j++) {
					sb.append(alpha[j]);
				}
			}else {
				sb.append(s);
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	public static boolean nextPermutation() {
		int i = alpha.length-1;
		while(i>0 && alpha[i-1] >= alpha[i]) i--;
		if(i==0) return false;
		
		int j = alpha.length-1;
		while(alpha[i-1] >= alpha[j]) j--;
		
		swap(i-1,j);
		
		// 교환하고 이후 정렬
		int k = alpha.length-1;
		
		while(i<k) {
			swap(i,k);
			i++;
			k--;
		}
		return true;
		
	}
	
	public static void swap(int  i, int j) {
		char temp = alpha[i];
		alpha[i]=alpha[j];
		alpha[j]=temp;
		
	}

}
