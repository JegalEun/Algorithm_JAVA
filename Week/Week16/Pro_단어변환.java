import java.util.*;
class Solution {
    static boolean visited[];
    static int count;
    static int answer=0;
    
    public int solution(String begin, String target, String[] words) {
    
    	visited = new boolean[words.length];
    	dfs(begin, target, words, 0);
    	return answer;
    }
    
    public static void dfs(String begin, String target, String[] words, int depth){
        
        if(begin.equals(target)) {
        	answer=depth;
        	return;
        	
        }else {
        	for(int i=0;i<words.length;i++) {
        		if(!visited[i]) {
        			int k=0;
        			for(int j=0;j<begin.length();j++) {
        				if(begin.charAt(j)==words[i].charAt(j)) {
        					// 문자가 같으면
        					k++;
        				}
        			}
        			if(k==begin.length()-1) {
        				//한글자빼고 같을 경우
        				visited[i]=true;
                        String b = words[i];
        				dfs(b, target, words, depth+1);
        				visited[i]=false;
        			}
        		}
        	}
        }
    }
}
