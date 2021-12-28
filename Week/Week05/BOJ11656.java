package Week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11656 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb  = new StringBuilder();
		
		String input = br.readLine();
		String [] alpha = new String[input.length()];
		String [] result=new String[input.length()];
		
		alpha=input.split("");
		
		for(int i=0;i<input.length();i++) {
			result[i]=input.substring(i,input.length());
		}
		
		Arrays.sort(result);
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}

	}

}
