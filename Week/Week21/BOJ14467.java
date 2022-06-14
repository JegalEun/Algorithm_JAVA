package Week22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ14467 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans=0;
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());	
			int number = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());
			
			if(map.containsKey(number)) {
				// 이미 나왔던 소면
				int temp = map.get(number);
				if(temp!=dir) {
					// 길을 건너면
					ans++;
				}
				map.put(number, dir);
			}else {
				//	새로 나온 넘버의 소면
				map.put(number, dir);
			}
		}
		System.out.println(ans);

	}

}
