import java.util.ArrayList;
import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<String> color = new ArrayList<>();
		color.add("black");
		color.add("brown");
		color.add("red");
		color.add("orange");
		color.add("yellow");
		color.add("green");
		color.add("blue");
		color.add("violet");
		color.add("grey");
		color.add("white");
		
		Scanner sc = new Scanner(System.in);		//값 입력
		String input1 = sc.next();
		String input2 = sc.next();
		String input3 = sc.next();
		
		int num1=color.indexOf(input1)*10;
		int num2=color.indexOf(input2);
		int num3=color.indexOf(input3);
	
		System.out.println((num1+num2)*(long)Math.pow(10, num3));
		
		
		

	}

}