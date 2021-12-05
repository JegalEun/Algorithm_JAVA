import java.util.Scanner;

public class BOJ2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] input=  new int[9];
		
		for(int i=0;i<9;i++) {
			input[i]=Integer.parseInt(sc.next());				// 값 받아서 정수로 변환
		}
		
		int max = input[0];
		int index=0;
		
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
				index=i;
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
	}

}
