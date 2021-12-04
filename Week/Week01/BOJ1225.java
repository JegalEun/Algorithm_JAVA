import java.util.Scanner;

public class BOJ1225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String [] num = input.split(" ");		// 공백 기준으로 나누기
		long result=0;
		
		for(int i=0;i<num[0].length();i++) {
			for(int j=0;j<num[1].length();j++) {
				result+=((num[0].charAt(i))-'0')*((num[1].charAt(j))-'0');
			}
		}
		System.out.println(result);

	}

}