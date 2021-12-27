import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10820 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input="";
		
		int lower;
		int upper;
		int space;
		int number;
		
		
		while((input=br.readLine())!=null) {
			lower=0;
			upper=0;
			space=0;
			number=0;
			
			for(int i=0;i<input.length();i++){
				char c = input.charAt(i);
				if(65<=c && c<=90) {
					upper++;
				}else if(97<=c && c<=122) {
					lower++;
				}else if(c==' '){
					space++;
				}else {
					number++;
				}
			}
			
			sb.append(lower+" "+upper+" "+number+" "+space+"\n");
		}
		
		System.out.println(sb);

	}

}
