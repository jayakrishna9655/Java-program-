package basic_programs;

class jk {
	int age() throws ClassNotFoundException{
		return 22;
	}
	
}

public class exception_handling {

	public static void main(String[] args) {
		
		int i=0;
		int j=0;
		
		try {
			 j=i/10;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(j);
		}
		finally {
			System.out.println("bye");
			System.out.println(j);
		}
		

	}

}
