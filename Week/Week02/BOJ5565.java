import java.util.Scanner;

public class BOJ5565 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int sum=0;
		int [] book = new int[9];
		
		for(int i=0;i<9;i++) {
			book[i]=sc.nextInt();		//  값  받기
			sum+=book[i];
		}
		
		System.out.println(total-sum);
		
		

	}

}
