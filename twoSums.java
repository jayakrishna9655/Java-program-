package basic_programs;

import java.util.HashMap;

public class twoSums {

	public static void main(String[] args) {
        int arr[] = {2, 8,6, 15};
        int target = 8;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                System.out.println("Pair found: " + needed + " and " + arr[i]);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }
}
