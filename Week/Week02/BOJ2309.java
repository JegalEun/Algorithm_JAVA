import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2309 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int [] height=new int[9];
		int total=0;
		int [] falut =new int[2];
		boolean isTrue = false;

		for(int i=0;i<9;i++) {
			height[i]=sc.nextInt();				// 난쟁이 키 받기
		}
		
		for(int i=0;i<9;i++) {
			total+=height[i];					// 난쟁이 키 다 더하기
		}
		
		System.out.println("");
		
		for(int i=0;i<9;i++) {
			if(isTrue) break;
			else {
				for(int j=1;j<8;j++) {
					int sum=height[i]+height[j];
					if(total-sum==100) {			//total-키의 합=100이면 난쟁이
						falut[0]=height[i];
						falut[1]=height[j];			// 난쟁이가 아닌 애 넣기
						isTrue=true;
						break;
					}
					else {
						continue;
					}
				}
			}
		}
		
		Arrays.sort(height);
		
		for(int i=0;i<height.length;i++) {
			if(height[i]!=falut[0] && height[i]!=falut[1]) {
				System.out.println(height[i]);
			}
		}
	}

}
