import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ17413 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// < 만나면 그대로 출력하고 나머지는 뒤집기

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		boolean flag = false;
		
		for(int i=0;i<input.length();i++) {
			
			if(input.charAt(i)=='<') {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				flag=true;
				sb.append('<');
			}
			
			else if(flag==true){				// < 만나고
				
				if(input.charAt(i)=='>') {
					flag=false;
				}
				sb.append(input.charAt(i));
			}
			
			else if(flag==false){
				if(input.charAt(i)==' ') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' ');
				}else {
					stack.push(input.charAt(i));
				}
			}
		}
		
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
	}
}
