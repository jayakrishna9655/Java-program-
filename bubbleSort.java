package basic_programs;


class bubble {
 public int[] bubbleSortFunc(int[] arr) {
	int tem=0;
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr.length-1;j++) {
			 if(arr[j]>arr[j+1]) {
				 tem=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=tem;
			 }
		 }
	 }
	 for(int i :arr) {
		 System.out.print(i);
	 }
	 return arr;
}
}

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bubble obj=new bubble();
		int[] arr= {6,5,4,3,2,1};
		obj.bubbleSortFunc(arr);
		
		
	}

}
