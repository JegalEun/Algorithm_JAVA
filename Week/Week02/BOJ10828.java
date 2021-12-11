import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ10828 {

	static int top =-1;
	static int [] stack;
	
	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		stack = new int[num];
		
		StringTokenizer st = null;
		
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()){
			case "push" :
				push(Integer.parseInt(st.nextToken()));
				break;	
			case "pop" :
				sb.append(pop()).append('\n');
				break;
			case "size" :
				sb.append(size()).append('\n');
				break;
			case "empty" :
				sb.append(empty()).append('\n');
				break;
			case "top" :
				sb.append(top()).append('\n');
				break;
			}
		}
		
		System.out.println(sb);
	}
	
	public static void push(int num) {
		top++;
		stack[top]=num;
	}
	
	public static int pop() {
		if(top==-1) {
			return -1;
		}else {
			int num = stack[top];
			top--;
			return num;
		
		}
	}
	
	public static int size() {
		return top+1;
	}
	
	public static int empty() {
		if(top==-1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public static int top() {
		if(top==-1) {
			return -1;
		}
		else {
			return stack[top];
		}
	}

}
