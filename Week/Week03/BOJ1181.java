import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1181 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		String []input = new String[num];
		
		for(int i=0;i<num;i++) {
			input[i] = br.readLine();
		}
		
		Arrays.sort(input, new Comparator<String>() {			//인덱스의 길이를 기준으로 정렬
   	 		@Override
   	 		public int compare(String s1, String s2) {
   	 		if(s1.length() == s2.length()) {
   	 			return s1.compareTo(s2);			// 사전식 정렬
   	 		}else {
   	 			return s1.length() - s2.length();	// 그 
   	 		}
   	 		
   	 	}
   	 	});
		
		sb.append(input[0]+"\n");
		
		for(int i=1;i<num;i++) {
			if(!input[i].equals(input[i-1])){
				sb.append(input[i]+"\n");
			}
		}
		
		
		System.out.println(sb);

	}

}
