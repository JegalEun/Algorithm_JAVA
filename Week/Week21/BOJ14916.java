package Week22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14916 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count=0;

		while(n>0) {
			if(n%5==0) {
				// 5로 나눠지는 경우
				count+=(n/5);
				break;
			}else {
				// 5로 나눠지지 않으면
				n-=2;
				// 2 빼주기
				count++;
			}
		}
		
		if(n>=0) {
			System.out.println(count);
		}else {
			System.out.println("-1");
		}
		
	}

}
