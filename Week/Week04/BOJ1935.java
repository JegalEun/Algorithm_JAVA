import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ1935 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		Stack<Double> stack = new Stack<>();
		
		int [] numbers=new int[num];
		
		String input = br.readLine();

		for(int i=0;i<num;i++) {
			numbers[i]=Integer.parseInt(br.readLine());
		}
		
		int n=0;
		
		for(int i=0;i<input.length();i++) {
			
			char index = input.charAt(i);
			
			if(index=='*'||index=='/'||index=='+'||index=='-') {		
				// 연산자일 경우
				double n1=stack.pop();
				double n2=stack.pop();
				double result=0;
				switch(index) {
				case '*' : 
					result=n1*n2;
					break;
				case '/' :
					result=n2/n1;
					break;
				case '+' :
					result=n1+n2;
					break;
				case '-' :
					result=n2-n1;
					break;
					
				}	
				stack.push(result);
			}else {
				// 피연산자일 경우
				double d = numbers[index-'A'];
				stack.push(d);		// 정수로 변환
				n++;
			}
		}
		
		System.out.printf("%.2f", stack.pop());

	}

}
