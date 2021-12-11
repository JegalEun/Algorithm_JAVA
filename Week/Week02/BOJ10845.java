import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10845 {
	
	static int front=0;
	static int back=0;
	static int size=0;
	static int [] queue;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		queue = new int[num];
		int top=-1;
		
		for(int i=0;i<num;i++) {
			st=new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
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
			case "front":
				sb.append(front()).append('\n');
				break;
			case "back":
				sb.append(back()).append('\n');
				break;
			}
		}
		System.out.println(sb);

	}
	
	public static void push(int num) {
		queue[back++]=num;
		if(back>=queue.length) {
			back=0;
		}	
		size++;
	}
	
	public static int pop() {
		if(back==front) {
			return -1;
		}else {
			int data = queue[front];
			front++;
			
			if(front>=queue.length) {
				front=0;
			}
			
			size--;
			return data;
		}
	}
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if(size==0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static int front() {
		if(size==0) {
			return -1;
		}else {
			return queue[front];
		}
	}
	
	public static int back() {
		if(size==0) {
			return -1;
		}else if(back==0) {
			return queue[queue.length-1];
		}else {
			return queue[back-1];
		}
	}
}
