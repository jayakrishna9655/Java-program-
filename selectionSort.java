package basic_programs;

public class selectionSort {

	public static void main(String[] args) {
		
		int[] arr= {6,5,4,3,2,1};
		int tem=0;
		int minindex=0;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					tem=arr[j];
					arr[j]=arr[i];
					arr[i]=tem;
				}
			}
			System.out.println();
			for(int k : arr) {
				System.out.print(k);
			}
		}
		
//		for(int i : arr) {
//			System.out.print(i);
//		}

	}

}
