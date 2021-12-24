import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class BOJ1918 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> stack = new Stack<>();
		
		String input = br.readLine();
		
		for(int i=0;i<input.length();i++) {
			char c = input.charAt(i);
			
			switch(c) {
			case '+' :
			case '-' :
			case '*' :
			case '/' :
				while(!stack.isEmpty() && prior(stack.peek()) >= prior(c)) {
					sb.append(stack.pop());
				}
				stack.push(c);
				break;
			case '(' :
				stack.push(c);
				break;
			case ')' :
				while(!stack.isEmpty() && stack.peek()!='(') {
					sb.append(stack.pop());
				}
				stack.pop();
				break;
			default : 
				// 피연산자일때
				sb.append(c);
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
	
	}
	
	public static int prior(char c) {
		if(c=='(' || c==')') {
			return 0;
		}else if(c=='+'||c=='-') {
			return 1;
		}else if(c=='*'||c=='/'){
			return 2;
		}
		return -1;
	}

}
