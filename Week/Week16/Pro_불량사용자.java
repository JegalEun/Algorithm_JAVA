import java.util.*;
class Solution {
    static HashSet<String> hash;
    static boolean visited[];
    static boolean flag;
        
    public int solution(String[] user_id, String[] banned_id) {
        visited = new boolean[user_id.length];
        hash = new HashSet<>();
        flag = false;
        dfs(user_id, banned_id, 0);
        int answer = hash.size();
        return answer;
    }
    public static void dfs(String[] user_id, String[] banned_id, int idx){
        if(idx==banned_id.length){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<user_id.length;i++){
                if(visited[i]){
                    sb.append(i);
                }
            }
            hash.add(sb.toString());
            return;
        }else {
            for(int i=0;i<user_id.length;i++){
                if(!visited[i]){
                    flag=false;
                    if(user_id[i].length()==banned_id[idx].length()){
                        for(int j=0;j<user_id[i].length();j++){
                            if(banned_id[idx].charAt(j)=='*') continue;
                            if(banned_id[idx].charAt(j)!=user_id[i].charAt(j)){
                                // 다른 글자라면
                                flag=true;
                                break;
                            } 
                        }
                        if(!flag){
                            visited[i]=true;
                            dfs(user_id, banned_id, idx+1);
                            visited[i]=false;
                        }
                    }
                }
                
            }
        }
    }
}
