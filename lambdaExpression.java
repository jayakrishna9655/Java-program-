package basic_programs;

interface le{
	 void add();
}

public class lambdaExpression {

	public static void main(String[] args) {

		le obj=() -> System.out.println("jk");
			
		obj.add();
		
	}

}

