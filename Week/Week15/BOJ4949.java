package Week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String s = br.readLine();
			
			if(s.equals(".")) {
				break;
			}else {
				sb.append(solve(s)+"\n");
			}
			
		}
		
		System.out.println(sb);
	}
	
	public static String solve(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c=='(') {
				stack.push(c);
			}else if(c=='[') {
				stack.push(c);
			}else if(c==')') {
				if(stack.isEmpty() || stack.peek()!='(') {
					return "no";
				}
				else {
					stack.pop();
				}
			}else if(c==']') {
				if(stack.isEmpty() || stack.peek()!='[') {
					return "no";
				}
				else {
					stack.pop();
				}
			}
		}
		
		if(!stack.isEmpty()) {
			return "no";
		}else {
			return "yes";
		}
	}

}
