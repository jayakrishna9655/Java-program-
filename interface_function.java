package basic_programs;


interface x{
	void mark();
}
interface y{
	void result();
}
interface datasa extends x,y{
	void name();
	void age();
}
class inter implements datasa{

	@Override
	public void name() {
		
		System.out.println("name");
		
	}

	@Override
	public void age() {
		
		System.out.println("age");
		
	}

	@Override
	public void mark() {
		// TODO Auto-generated method stub
		System.out.println("mark");
		
	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		System.out.println("result");
		
	}
	
}

public class interface_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		inter obj = new inter();
		obj.age();
		obj.name();
		obj.mark();
		obj.result();
		
		
	}

}
