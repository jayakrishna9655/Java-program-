package basic_programs;

class funs{
public void linearMethod(int t,int[] data) {
	if (data == null || data.length == 0) {
        System.out.println("no data");
		return;
    }

    for (int i = 0; i < data.length; i++) {
        if (data[i] == t) {
        	System.out.println("the target is "+ 5 +" and we found the arr data here "+5);
            return; // return index
        }
    }

    System.out.println("no data");
}
}
public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funs obj=new funs();
		int [] arr= {1,2,3,4,5};
		obj.linearMethod(5, arr);
		
	}

}
