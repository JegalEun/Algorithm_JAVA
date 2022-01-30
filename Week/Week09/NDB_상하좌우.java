package Week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NDB_상하좌우 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int [] dx = {-1,1,0,0};
		int [] dy = {0,0,-1,1};
		String [] type  = {"L","R","U","D"};
		int x=1;
		int y=1;
		int new_x=1;
		int new_y=1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> move = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			move.add(st.nextToken());
		}
	
		for(int i=0;i<move.size();i++) {
			String s = move.get(i);
			
			for(int j=0;j<4;j++) {
				if(s.equals(type[j])) {
					new_x=x+dx[j];
					new_y=y+dy[j];
					
					if(new_x < 1 || new_x >= n || new_y < 1 || new_y >= n) continue;
					
					//벗어나지않으면 이동
					x=new_x;
					y=new_y;
					
				}
			}
		}
		System.out.println(y+" "+x);

	}

}
