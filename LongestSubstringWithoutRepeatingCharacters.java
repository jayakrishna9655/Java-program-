package basic_programs;

import java.util.HashSet;

class SolutionLengthOfLongestSubstring {
	
    public int lengthOfLongestSubstring(String s) {
    	
    	int left=0;
    	int max=0;
    	
    	HashSet<Character> set = new HashSet<Character>();
    	
    	for(int right=0;right<s.length();right++) {
    		
    		while(set.contains(s.charAt(right))) {
    			set.remove(s.charAt(left));
    			left++;
    		}
    		
    		set.add(s.charAt(right));
    		int length = right - left +1;
    		if(max<length) {
    			max=length;
    		}
    	}
    	
    	System.out.println(max);
		return max;
    }
}
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		
		SolutionLengthOfLongestSubstring sol = new SolutionLengthOfLongestSubstring();
		
		String s = "pwwkew";
		
		sol.lengthOfLongestSubstring(s);
		
	}
	
}
