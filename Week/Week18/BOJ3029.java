package Week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3029 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String start = br.readLine();
		String end = br.readLine();
		
		String [] Stime = start.split(":");
		String [] Etime = end.split(":");
		
		int[] num = new int[3];
		
		for(int i=0;i<3;i++) {
			num[i]=Integer.parseInt(Etime[i])-Integer.parseInt(Stime[i]);
			// 시간 차를 저장하기
		}
		
		if(start.equals(end)) {
			System.out.println("24:00:00");
		}else {
			if(num[2] < 0) {
				num[2] += 60;
				num[1]--;
			}
			if(num[1] < 0) {
				num[1] += 60;
				num[0]--;
			}
			if(num[0] < 0) {
				num[0] += 24;
			}
			
			System.out.format("%02d:%02d:%02d", num[0], num[1], num[2]);
		}

	}

}
