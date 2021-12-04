import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int members=sc.nextInt();				// 선수 입력
		int[] alpha = new int[26];

		ArrayList<Character> result=new ArrayList<>();
		

		for(int i=0;i<members;i++){
			String name =sc.next();
			int first = name.charAt(0)-97;		
			alpha[first]++;
			
			if(alpha[first]==5) {
				result.add((char)(first+97));
			}
		}
		
		if(result.size()==0){
			System.out.println("PREDAJA");
		}
		
		Collections.sort(result);			//정렬..
		for(int i=0;i<result.size();i++){
			System.out.print(result.get(i));
		}

	}

}