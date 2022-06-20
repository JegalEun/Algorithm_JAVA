package Week22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num==0) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}

		int result=0;
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		
		System.out.println(result);
	}

}
