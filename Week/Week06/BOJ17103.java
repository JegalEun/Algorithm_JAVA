package Week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ17103 {

	static boolean [] flag;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		flag=new boolean[1000000+1];
		int result=0;
		
		isSosu();
		
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(br.readLine());
			result=0;
			
			for(int j=2;j<=num/2;j++) {
				
				if(!flag[j]) {		// 소수인 것만
					int s = num-j;
					if(!flag[s]) {	// 뺐을 때 소수면?
						result++;
					}
				}
				
			}
			sb.append(result+"\n");
		}
		
		System.out.print(sb);
		

	}
	
	static void isSosu() {
		flag[0]=flag[1]=true;
		
		for(int i=2;i<Math.sqrt(flag.length);i++) {
			if(flag[i]) {
				continue;
			}else {
				for(int j=i*i;j<flag.length;j+=i) {
					flag[j]=true;
				}
			}
		}
	}

}
