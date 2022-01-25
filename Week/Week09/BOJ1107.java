package Week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ1107 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		ArrayList<Integer> btn = new ArrayList<>();
		
		int ans = Math.abs(100-n);	//100에서 -,+로 일일이 이동한 경우
		
		if(m!=0) {
			//고장난 버튼이 0개가 아닌경우
			st = new StringTokenizer(br.readLine());
		}
		
		for(int i=0;i<m;i++) {
			btn.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i = 0; i < 999999; i++) {  // i까지 숫자버튼으로 이동 후 +,- 버튼으로 이동하는 수
            String strChan = String.valueOf(i);

            // 숫자 버튼으로 이동 가능한지 체크
            boolean isPossible = true;
            for(int j = 0; j < strChan.length(); j++) {
                int num = strChan.charAt(j) - '0';
                if(btn.contains(num)) {
                	isPossible=false;
                	break;// 고장난 버튼이 있으면 다이렉트로 접근 불가능
                	}
                }
            
            if(isPossible) {
            	// 고장난 버튼은 일일이 +.- 이동
                int cnt = strChan.length() + Math.abs(i - n);  // 숫자 이동 후 +,- 이동
                ans = Math.min(ans, cnt);
                }
		}
		System.out.println(ans);
	}
}
