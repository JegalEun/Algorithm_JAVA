import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine().toUpperCase();		// 값 입력 받기
		
		int [] alpha = new int[26];
		
		for(int i=0;i<input.length();i++) {	
			alpha[input.charAt(i)-65]++;	
		}

		
		int max=0;
		int index=0;
		char result = 0;
		
		for(int i=0;i<alpha.length;i++) {
			if(alpha[i]>max) {
				max=alpha[i];						// 배열 중 가장 큰 값 가져오기
				index=i;
				result=(char) (index+65);
				
			}else if(max==alpha[i]) {				// 큰 값이 반복 될 때
				result='?';
			}
		}
		
		System.out.println(result);
	}
}
