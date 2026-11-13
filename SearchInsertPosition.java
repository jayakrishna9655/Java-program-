package basic_programs;

class SolutionSearchInsert {
    public int searchInsert(int[] nums, int target) {
    	
    	int left=0;
    	int right = nums.length;
    	int mid=0;
    	
    	while(left<right) {
    		
    		mid = left+(right-left)/2;
    		
    		if(nums[mid] == target) {
        		return mid;
        	}
    		
        	if(target < nums[mid]) {
        		right=mid;
        	}
        	else {
        		 left = mid + 1;
        	}
    		
    	}
    	System.out.println(left);
		return left;
    }
}
public class SearchInsertPosition {
	public static void main(String[] args) {
		SolutionSearchInsert sol = new SolutionSearchInsert();
		int[] nums = {1, 3, 5, 6};
		int target = 2;
		
		sol.searchInsert(nums, target);
		
	}
	
}
