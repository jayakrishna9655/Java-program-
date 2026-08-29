package basic_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class threeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
    	
    	ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
    	
    	Arrays.sort(nums);
    	//-4,-1,-1,0,1,2

    	for(int i=0;i<nums.length;i++) {
    		int left=i+1;
    		int right=nums.length-1;
    		
    		if(nums[i]>0) {
    			break;
    		}
    		if(i>0 && nums[i] == nums[i-1]) {
    			continue;
    		}
    		
    		while(left<right) {
    			int sum = nums[i] + nums[left] + nums[right];
    			
    			System.out.println("nums[i] "+nums[i] +"nums[left] "+ nums[left] + "  nums[right] "+nums[right]);
    			
    			if(sum ==0) {
    				list.add(Arrays.asList(nums[i],nums[left],nums[right]));
        			
        			while(left<right && nums[left] == nums[left+1]) {
        				left++;
        			}
        			while(left<right && nums[right] == nums[right-1]) {
        				right--;
        			}
        			left++;
    				right--;
    			}
    			else if(sum<0) {
    				left++;	
    			}
    			else {
    				right--;
    			}
    			
    		}
    		
    		
    	}
    	return list;
		
    }
}

class threeSum{
	public static void main(String[] args) {
		System.out.println("hi");
		threeSumSolution sol = new threeSumSolution();
		int[] arr = {0,0,0,0};
		System.out.println(sol.threeSum(arr));
		
	}
}