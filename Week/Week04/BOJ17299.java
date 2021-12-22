import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ17299 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		String[] ss = br.readLine().split(" ");
		
		int input[] = new int[num];
		
		for(int i=0;i<num;i++) {
			input[i]=Integer.parseInt(ss[i]);
		}
		
		int number[]=new int[1000001]; 
		
		for(int j=0;j<num;j++) {		
			number[input[j]]+=1;
		}
		
		int result[]= new int[num];		
		
		stack.push(0);
		
		for(int i=1;i<num;i++) {
			
			if(stack.isEmpty()) {
				stack.push(i);
			} 
			
			while(!stack.isEmpty() && number[input[stack.peek()]] < number[input[i]]) {
				result[stack.pop()]=input[i];
			}
			
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			result[stack.pop()]=-1;
		}		
		
		for(int x=0;x<num;x++) {
			sb.append(result[x]+" ");
		}
		
		System.out.println(sb);
	}

}
