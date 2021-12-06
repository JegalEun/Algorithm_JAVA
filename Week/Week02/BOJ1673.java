import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BOJ1673 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {

			String line = br.readLine();
			
			if(line==null) {
				break;
			}
			
			String[] str = line.split(" ");		
			
			int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
			int result=0;
			
			while(true) {
				
				if(n<k){
					break;
				}
				
				int new_coupon=n/k;
				result+=new_coupon*k;		
				n%=k;
				n+=new_coupon;
				
			}
							
			System.out.println(n+result);
		}
		
	}
}
