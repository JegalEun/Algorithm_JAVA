import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		String input = br.readLine();
		int num = Integer.parseInt(br.readLine());
		
		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();
		
		for(int i=0;i<input.length();i++) {
			left.push(input.substring(i,i+1));		// 왼쪽 스택에 다 넣기
		}
		
		for(int i=0;i<num;i++) {
			
			st=new StringTokenizer(br.readLine());
			String alpha = st.nextToken();
			
			switch(alpha) {
			case "L" :
				if(!left.isEmpty()) {
					right.push(left.pop());
				}
				break;
			case "D" :
				if(!right.isEmpty()) {
					left.push(right.pop());
				}
				break;
			case "B" :
				if(!left.isEmpty()) {
					left.pop();
				}
				break;
			case "P" :
				left.push(st.nextToken());
				break;
			}
		}
		
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		
		while(!right.isEmpty()) {
			sb.append(right.pop());
		}

		System.out.println(sb);

	}

}
