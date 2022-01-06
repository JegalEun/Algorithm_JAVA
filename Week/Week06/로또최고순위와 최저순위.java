class Solution {
    
    int higher=0;
    int lower=0;
    int []result=new int[2];
    
    public int[] solution(int[] lottos, int[] win_nums) {
        
        for(int i=0;i<lottos.length;i++){
            if(lottos[i]==0){
                higher++;
            }
            for(int j=0;j<lottos.length;j++){
                if(lottos[i]==win_nums[j]){
                    lower++;
                }
            }
        }
        int m = higher+lower;
        switch(m) {
        case 6 : result[0]=1; break;
        case 5 : result[0]=2; break;
        case 4 : result[0]=3; break;
        case 3 : result[0]=4; break;
        case 2 : result[0]=5; break;
        case 1 : result[0]=6; break;
        case 0 : result[0]=6; break;
        }
        
        int k = lower;
        switch(k) {
        case 6 : result[1]=1; break;
        case 5 : result[1]=2; break;
        case 4 : result[1]=3; break;
        case 3 : result[1]=4; break;
        case 2 : result[1]=5; break;
        case 1 : result[1]=6; break;
        case 0 : result[1]=6; break;
        }
        
        return result;
    }
}
