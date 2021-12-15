import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		int count=0;
		
		while(true) {
			if(input%5==0) {			//5로 나누어떨어졌을 때
				System.out.println(input/5+count);
				break;
			}else if(input <= 0) {		
				System.out.println("-1");
				break;
			}
			
			input=input-3;
			count++;
		}
	}

}
