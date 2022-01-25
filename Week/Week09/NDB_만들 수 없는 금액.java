package Week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NDB_만들수없는금액 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int coin[]=new int[n];
		boolean ans[]=new boolean[n*1000000];	// 화폐로 만들 수 있는 최대 금액
		
		for(int i=0;i<n;i++) {
			coin[i]=Integer.parseInt(st.nextToken());
			ans[coin[i]]=true;
			// 동전은 true처리
		}
		
		for(int i=0;i<n;i++) {
			int sum=coin[i];
			// 동전으로부터 구할 수 있는 모든 수를 true해주기
			for(int j=i+1;j<n-i;j++) {
				sum=coin[j]+sum;
				ans[sum]=true;
			}
		}
		
		for(int i=1;i<=ans.length;i++) {
			if(!ans[i]) {
				// true가 아닌 값이 나오면 출력하고 종료
				System.out.println(i);
				return;
			}
		}
	}
}
