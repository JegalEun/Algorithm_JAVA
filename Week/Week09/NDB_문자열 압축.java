class Solution {
    public int solution(String s) {
       int answer = s.length();
    	
        for(int i=1;i<=s.length()/2;i++) {
        	int sum=1;
        	StringBuilder sb = new StringBuilder();
        	String n = s.substring(0,i);	// 문자열 (1개부터 n/2까지) 잘라내기
        
        	for(int j=i;j<=s.length();j+=i) {
        		// 다음 문자열비교
        		String m = s.substring(j,j+i > s.length()? s.length():i+j);
        		if(n.equals(m)) {
        			//앞뒤 문자열이 같을 경우
        			sum++;
        			// 압축레벨 증가
        		}else {
        			//앞뒤 문자열이 다를 경우
        			if(sum==1) {
        				// 압축이안되면 문자열만 저장
        				sb.append(n);
        			}else {
        				sb.append(sum).append(n);
        			}
        			n=m;
        			sum=1;
        		}
        	}
        
        	sb.append(n);
        	answer=Math.min(sb.length(),answer); 	//문자열 길이 최솟값 저장
        	
        }
        
        return answer;
    }
}
