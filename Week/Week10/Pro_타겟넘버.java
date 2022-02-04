class Solution {
	int count=0;
	
    public int solution(int[] numbers, int target) {
    	
    	dfs(numbers, target, 0, numbers.length, 0);
    	
        int answer = count;
        return answer;
    }
    void dfs(int []numbers, int target,int depth, int length, int sum) {
    	
    	if(depth==length) {
    		if(sum==target) {
    			count++;
    		}
    	}else {
    		int add = sum+numbers[depth];
    		int sub = sum-numbers[depth];
    		
    		dfs(numbers, target, depth+1, length, add);
    		dfs(numbers,target, depth+1, length, sub);
    	}
    }
}
