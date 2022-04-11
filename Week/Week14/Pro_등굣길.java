import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int mod = 1000000007;
        int [][] street = new int[n+1][m+1];
        
        for(int i=0;i<puddles.length;i++) {
        	street[puddles[i][1]][puddles[i][0]]=-1;
        }
        
        street[1][1]=1;
        
        for(int i=1;i<n+1;i++) {
        	for(int j=1;j<m+1;j++) {
              	if(street[i][j]==-1) continue;
              	if(street[i-1][j]>0) street[i][j]+=street[i-1][j]%mod;
              	if(street[i][j-1]>0) street[i][j]+=street[i][j-1]%mod;
        	}
        }
        
        return street[n][m]%mod;
    }
}
