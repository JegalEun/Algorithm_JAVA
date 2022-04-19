package Week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ2504 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		int temp=1;
		int answer=0;
		boolean flag = true;
		
		for(int i=0;i<input.length();i++) {
			char cur = input.charAt(i);
			
			if(cur=='(') {
				stack.push(cur);
				temp*=2;
			}else if(cur=='[') {
				stack.push(cur);
				temp*=3;
			}else {
				if(cur==')') {
					if(stack.isEmpty() || stack.peek()!='(') {
						// 올바르지 않는 괄호
						flag = false;
						break;
					}
					else {
						if(input.charAt(i-1)=='(') {
							// 바로 이전 값이 '('
							answer+=temp;
						}
						stack.pop();
						temp/=2;
					}
				}
				else if(cur==']') {
					if(stack.isEmpty() || stack.peek()!='[') {
						flag=false;
						break;
					}else {
						if(input.charAt(i-1)=='[') {
							// 바로 이전 값이 '['
							answer+=temp;
						}
						stack.pop();
						temp/=3;
					}
				}
			}
		}
		if(!flag||!stack.isEmpty()) {
			System.out.println("0");
		}else {
			System.out.println(answer);
		}
		
	}

}
