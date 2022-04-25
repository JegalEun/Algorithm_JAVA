package Week16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ8911 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int dx[]= {-1,0,1,0};
		// 북쪽이라서
		int dy[]= {0,1,0,-1};
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			
			int now_x=0, now_y=0;
			int max_x=0, max_y=0;
			int min_x=0, min_y=0;
			int rot=0;
			
			for(int j=0;j<s.length();j++) {
				char c = s.charAt(j);
				
				if(c=='F') {
					now_x=now_x+dx[rot];
					now_y=now_y+dy[rot];
				}else if(c=='B') {
					now_x=now_x-dx[rot];
					now_y=now_y-dy[rot];
				}else if(c=='R') {
					if(rot==3) rot=0;
					else rot++;
				}else if(c=='L') {
					if(rot==0) rot=3;
					else rot--;
 				}
				max_x=Math.max(max_x, now_x);
				max_y=Math.max(max_y, now_y);
				min_x=Math.min(min_x, now_x);
				min_y=Math.min(min_y, now_y);
			}
			System.out.println(Math.abs(max_x-min_x)*Math.abs(max_y-min_y));
		}
	}

}
