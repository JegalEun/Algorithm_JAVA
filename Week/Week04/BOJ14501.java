import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14501 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int day = Integer.parseInt(br.readLine());		//퇴사일 디데이
		int time[] = new int[day];						// 상담소요시간
		int pay[] = new int[day];						// 페이
		int money[] = new int[day+1];					// 지금까지의 최대 수입 (+1한 이유는 money[i+1]해주기 때문)
		
		for(int i=0;i<day;i++) {
			st = new StringTokenizer(br.readLine());
			time[i]=Integer.parseInt(st.nextToken());		//입력받은 상담시간과 페이를 각각 배열에 저장
			pay[i]=Integer.parseInt(st.nextToken());
		}
		
		int during=0;
		
		for(int i=0; i<day; i++) {
			
			during=i+time[i];							//상담완료 날짜
			
			if(during<=day) {							// 상담완료 날짜가 퇴사일을 넘지않는 경우
				money[during]=Math.max(money[during], money[i] + pay[i]);
				// 상돰완료 날짜까지 번 돈과 지금까지 최대 수입 + 일당 비교해서 더 큰 값을 저장
			}
			
			money[i+1] = Math.max(money[i+1], money[i]);		// 상담 중 벌수있는 비용이 큰 값 저장
			
		}
		
		System.out.println(money[day]);			// 퇴사날까지 최대비용 출력
	}

}
