import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10799 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		Stack<Character> stack = new Stack<>();
		
		int size=0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='(') {
				stack.push('(');
				continue;
			}
			else if(input.charAt(i)==')') {
				stack.pop();
				
				if(input.charAt(i-1)=='(') {		//레이저
					size+=stack.size();
				}else {
					size++;
				}
			}
		}
		
		System.out.println(size);

	}

}
