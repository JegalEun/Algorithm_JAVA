package Week08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NDB_1이될때까지 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 1로 빼거나 k로 나누어서 1로 만들기까지 연산 횟수 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count=0;
		
		while(n!=1) {
			if(n%k!=0) {
				// k로 나누어 떨어지지 않을때
				n--;
				count++;
			}else {
				// k로 나누어 떨어질 때
				n = n/k;
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
