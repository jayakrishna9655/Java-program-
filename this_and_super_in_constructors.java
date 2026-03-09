package basic_programs;

class a{
	
	public a() {
		System.out.println("in a");
	}
}
class b extends a{
	
	public b() {
		super();
		System.out.println("in b");
	}
	public b(int n) {
		this();
		System.out.println("in b int");
	}
	
	
}

public class this_and_super_in_constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		b obj = new b(1);
		
	}

}
