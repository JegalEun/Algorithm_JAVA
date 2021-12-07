import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1919 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String first = br.readLine();		//첫번째 문자열
		String secon = br.readLine();		//두번째 문자열
		
		int [] alphas = new int[26];
		
		int result=0;
		
		// 첫번째 문자열 
		
		for(int i=0;i<first.length();i++) {
			int alpha = first.charAt(i)-97;			// 알파벳 추출해서 넣기
			alphas[alpha]++;
		}


		for(int i=0;i<secon.length();i++) {
			int alpha = secon.charAt(i)-97;
			alphas[alpha]--;
		}
		
		for(int i=0;i<alphas.length;i++) {
			if(alphas[i]!=0) {
				result+=Math.abs(alphas[i]);
			}
		}
		
		System.out.println(result);
		
	}

}
