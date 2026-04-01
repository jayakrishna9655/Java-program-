package basic_programs;

public class largest_and_second_largest_element_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		int max=0;
		int secmax=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				System.out.println("arr[i] "+arr[i]+"arr[j] "+arr[j]);
				
				if(arr[i]<arr[j]) {
					max=arr[j];
				}
				if(max>arr[j]) {
					secmax=arr[j];
				}
				
			}
		}
		System.out.println("max "+max);
		System.out.println("secmax "+secmax);
	}

}
