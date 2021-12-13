import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());			// 값 입력받기
		
		for(int i=0;i<num;i++) {
			
			boolean stop=false;
			
			String input = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			for(int j=0;j<input.length();j++) {
				
				char left = input.charAt(j);
				
				if(left=='(') {								//'(' 만나면 스택에 추가해주기
					stack.push(left);
				}
				else if(left==')') {				
					if(stack.empty()) {
						stop=true;
						break;
					}else {	
						stack.pop();
					}
				}
			}
			
			if(!stack.isEmpty() || stop) {						
				sb.append("NO\n");
			}else {
				sb.append("YES\n");
			}
		}
		System.out.println(sb);
	}
}
