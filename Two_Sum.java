package basic_programs;

class TwoSumss {
    public void twoSumSolution(int arr[], int t) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == t) {
                	System.out.println("arr[i],arr[i]"+arr[i]+","+arr[j]);
                    return;
                }
            }
        }
    }
}

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t=5;
		int arr[]= {1,2,3,4};
		TwoSumss obj=new TwoSumss();
		obj.twoSumSolution(arr, t);
	}

}
