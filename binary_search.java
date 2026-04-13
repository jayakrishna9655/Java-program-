package basic_programs;

class binary_search_funs_class{
	public void binary_search_funs(int[] arr,int t) {
		int left=0;
		int right=arr.length;
		while(left<=right) {
			int med = (left+right)/2;
			if(arr[med]==t) {
				System.out.println("value :"+med);
				return;
			}
			else if(arr[med]<t) {
				left =med+1;
			}
			else {
				right =med-1;
			}
		}
	}
}

public class binary_search {

	public static void main(String[] args) {
		
		binary_search_funs_class obj=new binary_search_funs_class();
		int[] arr= {1,2,3,4,5,6,78,98};
		obj.binary_search_funs(arr, 8);

	}

}
