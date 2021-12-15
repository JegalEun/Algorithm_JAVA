import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<num;i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int index=0;
			double student = Double.parseDouble(st.nextToken());
			double [] score = new double[(int) student];
			
			while(st.hasMoreTokens()) {
				score[index]=Integer.parseInt(st.nextToken());
				index++;
			}
			
			int sum=0;
			double avg=0;
			
			for(int j=0;j<student;j++) {
				sum+=score[j];
			}
			
			avg=sum/student;			//평균
			double count=0;
			
			for(int k=0;k<student;k++) {
				if(avg<score[k]) {
					count++;
				}
			}
			
			double result=count/student*100;
			
			sb.append(String.format("%.3f", result)).append("%\n");		//3번째 자리까지
		}
		
		System.out.println(sb);

	}

}
