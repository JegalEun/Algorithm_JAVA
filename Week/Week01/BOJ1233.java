
import java.util.Scanner;

public class BOJ1233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();		// 숫자 세개 이어 받기
		
		String [] split = input.split(" ");	// 공백을 기준으로 나누기
		
		int [] num1=new int[Integer.parseInt(split[0])];		//각 숫자의 크기만큼 배열 생성
		int [] num2=new int[Integer.parseInt(split[1])];
		int [] num3=new int[Integer.parseInt(split[2])];
		
		
		for(int i=0;i<num1.length;i++) {				//1부터 순차대로 숫자 저장
			num1[i]=i+1;
		}
		for(int i=0;i<num2.length;i++) {
			num2[i]=i+1;
		}
		for(int i=0;i<num3.length;i++) {
			num3[i]=i+1;
		}
		
		int [] result = new int[81];		// 더한 값 저장하는 배열
		int sum;
		
		for(int i=0;i<Integer.parseInt(split[0]);i++) {
			for(int j=0;j<Integer.parseInt(split[1]);j++) {
				for(int k=0;k<Integer.parseInt(split[2]);k++) {
					sum=num1[i]+num2[j]+num3[k];
					result[sum]++;
				}
			}
		}
		
		int index=0;
		int max=0;
		
		for(int i=0;i<result.length;i++) {
			if(result[i]>max) {
				max=result[i];
				index=i;
			}
		}
		
		System.out.println(index);

	}

}
