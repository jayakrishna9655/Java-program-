package basic_programs;

class test{
	int num;
	
	String name() {
		System.out.println("name");
		return null;
	}
	String display() {
		System.out.println("display");
		return null;
	}
}

public class global_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test obj=new test();
		obj.num=10;
		obj.display();
		System.out.println(obj.num);
	}

}
