package Week15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10972 {
	
	static int arr[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		if(nextPermutation()) {
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}else {
			System.out.println("-1");
		}
		
	}
	
	static void swap(int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	private static boolean nextPermutation() {
	    int i = arr.length-1;
	    
	    while(i > 0 && arr[i-1] >= arr[i]) i--;
	    if(i <= 0) return false;

	    int j = arr.length-1;

	    while(arr[j] <= arr[i-1]) j--;

	    swap(i-1, j);
	    j = arr.length - 1;
	    while(i < j) {
	        swap(i, j);
	        i++;
	        j--;
	    }
	    return true;
	}



}
