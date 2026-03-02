package basic_programs;

public class multi_dimensional_array_in_two_different_for_loob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr = new int[4][8];
        
        for(int i=0;i<4;i++) {
        	for(int j=0;j<5;j++) {
        		arr[i][j]=(int)(Math.random()*10);
        	}
        }
        for(int i=0;i<4;i++) {
        	for(int j=0;j<5;j++) {
        		System.out.print(arr[i][j] +"");
        	}
        	System.out.println();
        }
        // we can all use other for loop and it not even need to define size of the array here and the name of this is "jagged"
        System.out.println();
        
        int nums[][] = new int [3][];
        nums[0]=new int[5];
        nums[1]=new int[8];
        nums[2]=new int[2];
        
        for(int i=0;i<nums.length;i++) {
        	for(int j=0;j<nums[i].length;j++) {
        		nums[i][j]=(int)(Math.random()*10);
        	}
        }
        for(int n[]:nums) {
        	for(int nl :n) {
        	  System.out.print(nl);	
        	}
        	 System.out.println();
        }
        
	}

}
