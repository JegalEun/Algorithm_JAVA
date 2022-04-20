package Week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BOJ10866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		ArrayDeque<String> deque = new ArrayDeque<>();
		
		for(int i=0;i<n;i++) {
			String s[] = br.readLine().split(" ");
			
			switch(s[0]) {
			case "push_front":
				deque.addFirst(s[1]);
				break;
			case "push_back":
				deque.addLast(s[1]);
				break;
			case "pop_front":
				if(deque.isEmpty()) {
					sb.append("-1"+"\n");
					break;
				}
				sb.append(deque.pollFirst()+"\n");
				break;
			case "pop_back":
				if(deque.isEmpty()) {
					sb.append("-1"+"\n");
					break;
				}
				sb.append(deque.pollLast()+"\n");
				break;
			case "size":
				sb.append(deque.size()+"\n");
				break;
			case "empty":
				if(deque.isEmpty()) {
					sb.append("1"+"\n");
				}else {
					sb.append("0"+"\n");
				}
				break;
			case "front":
				if(deque.isEmpty()) {
					sb.append("-1"+"\n");
					break;
				}
				sb.append(deque.peekFirst()+"\n");
				break;
			case "back":
				if(deque.isEmpty()) {
					sb.append("-1"+"\n");
					break;
				}
				sb.append(deque.peekLast()+"\n");
				break;
			}
			
		}
		System.out.println(sb);
	}

}
