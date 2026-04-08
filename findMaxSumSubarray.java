package basic_programs;
class findMaxSumSubarrays{
public void findMaxSumSubarray(int[] arr, int k) {
    if (arr == null || k > arr.length) return ;

    int maxSum = 0;
    int windowSum = 0;

    // Calculate sum of the first window
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];
    }
    
    maxSum = windowSum;

    // Slide the window across the rest of the array
    for (int i = k; i < arr.length; i++) {
        windowSum += arr[i] - arr[i - k]; // Add next, subtract previous
        maxSum = Math.max(maxSum, windowSum);
    }
    System.out.println("maxSum :"+maxSum);
   
}
}
public class findMaxSumSubarray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	int k=3;
	findMaxSumSubarrays obj = new findMaxSumSubarrays();
	obj.findMaxSumSubarray(arr, k);
}
}
