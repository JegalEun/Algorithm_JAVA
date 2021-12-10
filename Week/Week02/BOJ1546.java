import java.util.Scanner;

public class BOJ1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		int subject = sc.nextInt();			// 과목수 입력
		double [] score=new double[subject];		// 점수 입력
		
		for(int i=0;i<subject;i++) {
			score[i]=sc.nextDouble();
		}

		
		double max=0;
		for(int i=0;i<subject;i++) {
			if(score[i]>max) {
				max=score[i];			// 최고점 반환
			}
		}

		for(int i=0;i<subject;i++) {
			score[i]=score[i]/max*100;		// 점수 변환
		}
		
		double sum=0;
		for(int i=0;i<subject;i++) {
			sum+=score[i];
		}
		
		System.out.println(sum/subject);

	}

}
