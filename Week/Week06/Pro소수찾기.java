package Week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pro소수찾기 {
	
	static boolean flag[];
	static boolean [] visited;
	static char [] newArr;
	static ArrayList<Integer> result;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();
		
		newArr = new char[n.length()];
		visited= new boolean[n.length()];
		result = new ArrayList<>();
		
		for(int i=1;i<=n.length();i++) {
			dfs(i,0,n);
		}
		
		System.out.println(result.size());
		
	}
	
	// 소수 판단
	static boolean sosu(int n) {
		
		if(n==0 | n==1) return false;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		
		return true;
	}
	
	static void dfs(int length, int depth, String n) {
		
		if(depth==length) {
			
			String s="";
			
			// 숫자로 변환
			for(int i=0;i<length;i++) {
				s+=String.valueOf(newArr[i]);
			}
			
			int num = Integer.parseInt(s);
			
			// 소수인지 확인
			sosu(num);
			
			if(sosu(num)) {
				if(!result.contains(num)) result.add(num);
			}
			
		}else {
			for(int i=0;i<n.length();i++) {
				if(!visited[i]) {
					visited[i]=true;
					newArr[depth]=n.charAt(i);
					dfs(length, depth+1, n);
					visited[i]=false;
				}
			}
		}
	}


}
