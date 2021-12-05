import java.util.Scanner;

public class BOJ1668 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();			// 트로피의 개수
		int [] num=new int[total];			// 트로피의 높이
		
		for(int i=0;i<total;i++) {
			num[i]=sc.nextInt();
		}
		
		int max=0;
		int temp=num[0];				// 배열 안에서 max
		
		int right=0;
		int left=0;
		
		
		// 왼쪽에서 볼 때
		for(int i=0;i<num.length;i++) {
			if(temp<num[i]) {
				left++;
				temp=num[i];
			}
		}
		
		temp=num[num.length-1];
		
		// 오른쪽에서 볼 때
		for(int i=num.length-1;i>=0;i--) {
			if(temp<num[i]) {
				right++;
				temp=num[i];
			}
		}
		
		
		System.out.println(left+1);
		System.out.println(right+1);
		
	}

}
