package Week18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class BOJ20291 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Map<String, Integer> result = new TreeMap<>();
		// key 자동 정렬 = TreeMap
		
		for(int i=0;i<n;i++) {
			String s = br.readLine();
			String temp[] = s.split("\\.");
			
			if(result.containsKey(temp[1])) {
				result.put(temp[1], result.get(temp[1])+1);
			}else {
				result.put(temp[1], 1);
			}
		}
		
		for(String key : result.keySet()) {
			System.out.println(key+" "+result.get(key));
		}
		
		
		
	}

}
