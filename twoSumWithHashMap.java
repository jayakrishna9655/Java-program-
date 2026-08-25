package basic_programs;

import java.util.HashMap;

public class twoSumWithHashMap {

	public static void main(String arg[]) {
	
		int arr[] = {12,8,1,7}, target = 9;
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i =0;i<arr.length;i++) {
			
			int tem= target - arr[i];
			
			if(map.containsKey(tem)){
				
				System.out.println(tem+" "+arr[i]);
				
			}
			
			map.put(arr[i],i);
			
		}
		
	}
	
}
