import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
    	ArrayList<Integer> result = new ArrayList<>();
    	
    	for(int index=0;index<commands.length;index++) {
    		int i = commands[index][0];
    		int j = commands[index][1];
    		int k = commands[index][2];
    		int newArr[] = new int[j-i+1];
    		int y=0;
    		
    		for(int x=i;x<=j;x++) {
    			newArr[y]=array[x-1];
    			y++;
    		}
    		Arrays.sort(newArr);
    		int num = newArr[k-1];
    		result.add(num);
    		
    	}
    	int[] answer = new int[result.size()];
    	
    	for(int i=0;i<result.size();i++) {
    		answer[i]=result.get(i);
    	}
    	
        return answer;
    }
}

