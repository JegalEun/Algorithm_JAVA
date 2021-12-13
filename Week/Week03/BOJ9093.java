import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9093 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());		// 횟수 입력 받기
		
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());	// 문장 입력 받고 공백 기준으로 나누기
			
			while(st.hasMoreTokens()) {					// 문장이 끝날 때 까지
				String s = st.nextToken();				
				int size = s.length();
				
				for(int j=0;j<size;j++) {
					sb.append(s.charAt((size-1)-j));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
