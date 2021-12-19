import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ17298 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Stack<Integer> stack = new Stack<>();
		
		int num = Integer.parseInt(br.readLine());
		int [] arr = new int[num];
		
		st = new StringTokenizer(br.readLine());
		
		int j=0;
		
		while(st.hasMoreTokens()) {
			arr[j]=Integer.parseInt(st.nextToken());
			j++;
		}

		stack.push(0);
		
		for(int i = 1; i < num; i++) {
			
			if(stack.isEmpty()) {
				stack.push(i);
			}
			
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
		
		for(int i = 0; i < num; i++) {
			sb.append(arr[i]).append(' ');
		}
		
		System.out.println(sb);

	}

}
