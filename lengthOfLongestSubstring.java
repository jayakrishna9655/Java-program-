package basic_programs;

import java.util.HashSet;

class lengthOfLongestSubstringSolution{
	
	public int lengthOfLongestSubstring(String s) {
		HashSet<Character> map = new HashSet<Character>();
		int maxLength = 0;
        int left = 0;
        for(int right =0;right<s.length();right++) {
        	
        	while(map.contains(s.charAt(right))) {
        		map.remove(s.charAt(left));
        		left++;
        	}
        	System.out.println("left"+left);
        	System.out.println("right"+right);
        	map.add(s.charAt(right));
        	maxLength= Math.max(maxLength, right - left + 1);
        	
        }
        System.out.println(map.toString());
        System.out.println(maxLength);
        return maxLength;
    }
	
}
public class lengthOfLongestSubstring {
	public static void main(String[] args) {
		lengthOfLongestSubstringSolution sol = new lengthOfLongestSubstringSolution();
		sol.lengthOfLongestSubstring("pwwkew");
		
	}
	
}


//public int lengthOfLongestSubstring(String s) {
//    HashSet<Character> map = new HashSet<Character>();
//    int count =0;
//    for(int i=0;i<s.length();i++){
//        map.add(s.charAt(i));
//    }
//    System.out.println(map.size());
//    return map.size();
//}


//public int lengthOfLongestSubstring(String s) {
//    int[] map = new int[128];
//    Arrays.fill(map, -1);
//    char[] ch=s.toCharArray();
//    int n = s.length(), l = 0, maxLen = 0;
//    for (int r = 0; r < n; r++) {
//        if (map[ch[r]] >= l) {
//            l = map[ch[r]] + 1;
//        }
//        map[ch[r]] = r;
//        maxLen = Math.max(maxLen, r - l + 1);
//    }
//    return maxLen;
//}
