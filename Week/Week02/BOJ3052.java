
import java.util.Scanner;

public class BOJ3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		
		int [] input = new int[10];
		int [] result=new int[42];
		int sum=0;
		
		for(int i=0;i<10;i++) {
			input[i]=sc.nextInt();			//10개 수 입력받기
		}
		
		for(int i=0;i<10;i++) {
			int extra = input[i]%42;		// 나머지 저장
			result[extra]++;
		}
		
		
		for(int i=0;i<result.length;i++) {
			if(result[i]!=0) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
