import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		
		int [] alpha = new int[26];
		
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=-1;
		}
		
		for(int i=0;i<input.length();i++) {
			int index = input.charAt(i)-97;
			if(alpha[index]!=-1) {
				continue;
			}
			alpha[index]=i;
		}
		
		for(int i=0;i<alpha.length;i++) {
			sb.append(alpha[i]+" ");
		}
		System.out.println(sb);
		
	}

}
