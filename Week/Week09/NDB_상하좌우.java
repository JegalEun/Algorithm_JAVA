package Week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NDB_상하좌우 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x=1;
		int y=1;

		for(int i=0;i<=n;i++) {
			String s = st.nextToken();
			
			switch(s) {
				case "L" : 
					if(x>1){
						// 지도 안에 있을 때
						x--;
					}
					break;
				case "R" : 
					if(x<n) {
						x++; 
					}
					break;
				case "U" : 
					if(y>1) {
						y--; 
					}
					break;
				case "D" : 
					if(y<n) {
						y++; 
					}
					break;
			}	
		}
		
		System.out.println(y+" "+x);

	}

}
