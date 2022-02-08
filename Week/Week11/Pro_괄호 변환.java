class Solution_2 {
    
    // 변환 과정에 맞게 u를 변환하는 메소드.
    public static String reverse(String str){
        StringBuilder s = new StringBuilder();
         
        for(int i = 1; i<str.length()-1;i++){
            if(str.charAt(i) == '(') s.append(")");
            else s.append("(");
        }
        return s.toString();
    }
    
    // 올바른 괄호 문자열 판단 메소드.
    public static boolean check(String s){
    	
    	Stack<Character> stack = new Stack<>();
    	
    	for(int i=0;i<s.length();i++) {
    		char c = s.charAt(i);
    		
    		if(c=='(') {
    			stack.push('(');
    		}else if(c==')') {
    			if(!stack.isEmpty()) stack.pop();
    		}
    	}
    	
    	if(!stack.isEmpty()) {
    		return false;
    	}else {
    		return true;
    	}
    }
    
    // 균형잡힌 괄호 문자열 -> 올바른 괄호 문자열 변환 메소드.
    public static String uv(String w){
        
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();
        
        if(w.length() == 0) return "";
        
        int open = 0;
        for(int i =0;i<w.length();i++){ 
            if(w.charAt(i) == '(') open++;    
            else open--;
           
            if(open == 0){
                u.append(w.substring(0,i+1));
                v.append(w.substring(i+1,w.length()));
                
                
                // u가 "올바른 괄호 문자열"이라면,
                if(check(u.toString())){
                    u.append(uv(v.toString())); 
                // u가 "올바른 괄호 문자열"이 아니라면,    
                }else{
                    StringBuilder str = new StringBuilder();
                    str.append("(");
                    str.append(uv(v.toString()));
                    str.append(")");
                    str.append(reverse(u.toString()));
                    // 새로운 문자열을 반환한다.
                    return str.toString();
                }
                break;
            	}
            }
            return u.toString();   
    }
    
    public String solution(String p) {
        String answer;
        
 
        if(check(p))
            return p;
        
        answer = uv(p);
    
        return answer;
    }
}
