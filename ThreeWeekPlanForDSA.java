package basic_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagramsSol{
	
	public List<List<String>> groupAnagrams(String[] strs) {
		
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		
		for(int i=0;i<strs.length;i++) {
			
			char[] c = strs[i].toCharArray();
			
			Arrays.sort(c);
			
			String sort = new String(c);
			
			if(!map.containsKey(sort)) {
				
				map.put(sort, new ArrayList<String>());
				
			}
			
			map.get(sort).add(strs[i]);
			
		}
		System.out.println(map.values());
		
		return new ArrayList<List<String>>(map.values());
		
	}
	
}

public class ThreeWeekPlanForDSA {

	public static void main(String[] args) {
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		GroupAnagramsSol sol =new  GroupAnagramsSol();
		sol.groupAnagrams(strs);
		
	}
	
}
