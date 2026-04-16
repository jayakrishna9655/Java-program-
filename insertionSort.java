package basic_programs;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {6,5,4,3,2,1};
		
		for(int i=1;i<arr.length;i++) {
			
			int j=i-1;
			int key=arr[i];
			
			while(j>=0 && arr[j]>key) {
//				System.out.println("true "+i);
				arr[j+1]=arr[j];
				j--;
//				for(int n : arr) {
//					System.out.println(n);
//				}
//				return;
			}
			arr[j+1]=key;
			
		}
		
		for(int num :arr) {
			System.out.println(num);
		}
		
	}

}
