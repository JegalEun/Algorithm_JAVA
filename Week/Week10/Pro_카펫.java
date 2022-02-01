class Solution_5 {
    public int[] solution(int brown, int yellow) {

    	int[] answer=new int[2];
    	boolean fine=false;
    	
    	for(int i=1;i<=2000000;i++) {	
    		for(int j=1;j<=5000;j++) {	
    			if(brown==((2*i)+(2*j))-4) {
    				if(yellow==(i-2)*(j-2)) {
        				answer[0]=j;
            			answer[1]=i;
            			fine=true;
            			break;
    				}
    				
    			}
    		}
    		if(fine) break;
    	}

    	for(int i=0;i<2;i++) {
    		System.out.print(answer[i]+" ");
    	}
        return answer;
    }
}
