import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        //  모든 전화번호를 hashmap에 넣는다.
        for(String s: phone_book) hm.put(s, 1);
        
        // i의 길이만큼 자르고 해시맵에 존재하는지 확인
        for(int i=0;i<phone_book.length;i++){
            for(int j=0;j<phone_book[i].length();j++){
                if(hm.containsKey(phone_book[i].substring(0,j))) return false;
            }
        }
        
        return true;
        
        
    }
}
