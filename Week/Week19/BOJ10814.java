package Week19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		String input[][] = new String[n][2];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String age = st.nextToken();
			String name = st.nextToken();
			
			input[i][0]=age;
			input[i][1]=name;
		}
		
		Arrays.sort(input, new Comparator<String[]>(){
			public int compare(String []o1, String []o2) {
				// 나이 순으로 정렬
				return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
			}
		});
		
		for(int i=0;i<n;i++) {
			sb.append(input[i][0]).append(" ").append(input[i][1]).append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
