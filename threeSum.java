package basic_programs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

	public static void main(String[] args) {
		
		int[] arr= {-4 , -1 , -1 , 0 , 1 , 2};
		
		Arrays.sort(arr);
		
		ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
		
		//-4 , -1 , -1 , 0 , 1 , 2
		
		
		for(int i =0;i<arr.length;i++) {
			int left=i+1;
			int right=arr.length-1;
			
			if(arr[i]>0) {
				break;
			}
			if(i>0 && arr[i] == arr[i-1]){
    			continue;
    		}
			
			while(left<right) {
					int sum =arr[left]+arr[i]+arr[right];
					System.out.println("arr[left] "+arr[left]+" arr[i] "+arr[i]+" arr[right] "+arr[right]);
					if(sum == 0) {
						list.add(Arrays.asList(arr[left],arr[i],arr[right]));
						//System.out.println("arr[left] "+arr[left]+" arr[i] "+arr[i]+" arr[right] "+arr[right]);
						
						while(left < right && arr[left] == arr[left+1]) {
		   					left++;
		   				}
		   				while(left < right && arr[right] == arr[right-1]) {
		   					right--;
		   				}
						left++;
						right--;
					}
					
					else if(sum <0){
						left++;
					}
	    			else {
						right--;
					}
				}
			
			
			
			
		}
		
		System.out.println(list);
		
	}
	
}
