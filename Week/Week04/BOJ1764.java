import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ1764 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int [] input = new int[2];
		
		HashSet<String> names = new HashSet<>();
		ArrayList<String> result = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			input[0]=Integer.parseInt(st.nextToken());
			input[1]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<input[0];i++) {
			names.add(br.readLine());
		}
		
		int count =0;
		
		for(int i=0;i<input[1];i++) {
			String s = br.readLine();
			if(names.contains(s)) {
				result.add(s);
				count++;
			}
		}
		
		Collections.sort(result);			//오름차순 정렬
		sb.append(count+"\n");
		
		for(int i=0;i<result.size();i++) {
			sb.append(result.get(i)+"\n");
		}
		
		System.out.println(sb);
	}

}
