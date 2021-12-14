import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1874 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int num = Integer.parseInt(br.readLine());
		int [] number = new int[num];
		
		for(int i=0;i<num;i++) {
			number[i] = Integer.parseInt(br.readLine());
		}
		
		
		int n=0;
		
		for(int i=1;i<=num;i++) {
			stack.push(i);
			sb.append("+\n");
			
			while(!stack.isEmpty() && stack.peek()==number[n]) {
				stack.pop();
				sb.append("-\n");
				n++;
			}
			
		}
		
		if(!stack.empty()) {
			System.out.println("NO");
		}else {
			System.out.println(sb);
		}


	}

}
