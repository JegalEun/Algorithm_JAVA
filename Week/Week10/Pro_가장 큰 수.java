import java.util.*;
class Solution {
	boolean visited[];
	String newArr[];
	int max=0;
	
    public String solution(int[] numbers) {
    	String [] num = new String[numbers.length];
    	
    	for(int i=0;i<numbers.length;i++) {
    		num[i]=String.valueOf(numbers[i]);
    	}

    	Arrays.sort(num, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2+o1).compareTo(o1+o2);
			}
    		});
        String answer="";
        
    	if(num[0].equals("0")) answer="0";
    	else {
    		for(int i=0;i<num.length;i++) {
    			answer+=num[i];
    		}
    	}
   		return answer;
    }
}
