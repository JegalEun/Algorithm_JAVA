package Week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ5430 {
	
	static StringBuilder sb;
	static BufferedReader br;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		for(int i=0;i<t;i++) {
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
			
			for(int j=0;j<n;j++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}
			
			solve(p, deque);
		}
		System.out.println(sb);
	}
	
	public static void solve(String p, ArrayDeque<Integer> deque) throws IOException {
		
		boolean isOriginal = true;
		
		for(int i=0;i<p.length();i++) {
			char c = p.charAt(i);
			
			if(c=='R') {
				isOriginal = !isOriginal;
				// 방향바꾸기
				continue;
			}
			
			if(isOriginal) {
				if(deque.pollFirst()==null) {
					sb.append("error\n");
					return;
				}
			}
			else {
				if(deque.pollLast()==null) {
					sb.append("error\n");
					return;
				}
			}
		}
		
		print(deque,isOriginal);
		
	}
	
	public static void print(ArrayDeque<Integer> deque, boolean isOriginal) {
		sb.append("[");
		
		if(deque.size()>0) {
			if(isOriginal) {
				// 정방향일경우
				sb.append(deque.pollFirst());
				
				while(!deque.isEmpty()) {
					sb.append(",").append(deque.pollFirst());
				}
			}else {
				// 역방향일경우
				sb.append(deque.pollLast());
				
				while(!deque.isEmpty()) {
					sb.append(",").append(deque.pollLast());
				}
			}
		}
		
		sb.append("]").append("\n");
	}

}
