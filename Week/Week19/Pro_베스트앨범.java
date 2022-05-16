import java.util.*;
class Solution {

	public int[] solution(String[] genres, int[] plays) {
		
		
		HashMap<String, Integer> hm = new HashMap<>();
		HashSet<String> hs = new HashSet<>();
		
		for(int i=0;i<genres.length;i++) {
			hm.put(genres[i], hm.getOrDefault(genres[i],0)+plays[i]);
		}
		
		ArrayList<String> gen = new ArrayList<>();
		for(String s : hm.keySet()){
			gen.add(s);
		}
		// ArrayList 내림차순 
		Collections.sort(gen, (o1,o2)-> hm.get(o2)-hm.get(o1));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<gen.size();i++) {
			String s = gen.get(i);
			
			int max=0;
			int FIndex=-1;
			for(int j=0;j<genres.length;j++) {
				if(genres[j].equals(s) && plays[j] > max) {
					max=plays[j];
					FIndex=j;
				}
			}
			
			int SIndex=-1;
			max=0;
			
			for(int j=0;j<genres.length;j++) {
				if(genres[j].equals(s) && max < plays[j] && FIndex != j) {
					max = plays[j];
					SIndex=j;
				}
			}
			list.add(FIndex);
			if(SIndex>=0) list.add(SIndex);
		}
		
		int answer[] = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i);
		}
	
		return answer;
    }
}

