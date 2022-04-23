package Week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10973 {
	
	static int n;
	static int num[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		num = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		
		if(prev()) {
			for(int i=0;i<n;i++) {
				System.out.print(num[i]+" ");
			}
		}else {
			System.out.println("-1");
		}

	}
	
	static boolean prev() {
		int i = num.length-1;
		
		while(i > 0 && num[i]> num[i-1]) i--;
		// 오름차순일때까지 i--
		
		if(i<=0) return false;
		
		int j = num.length-1;
		
		while(num[i-1] < num[j]) j--;
		
		swap(i-1, j);
		// 자리 바꾸기
		
		j = num.length-1;
		
		while(i<j) {
			swap(i,j);
			i++;
			j--;
		}
		
		return true;
	}
	
	static void swap(int i, int j) {
		int temp = num[i];
		num[i]=num[j];
		num[j]=temp;
	}

}
