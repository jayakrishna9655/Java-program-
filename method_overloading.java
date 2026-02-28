package basic_programs;

class calce {
	int cals1(int a ,int b ) {
		
		return a+b;
	}
int cals1(int a ,int b ,int c) {
		
		return a+b+c;
}
		int cals1(int a ,int b ,int c ,int d) {
			
			return a+b+c+d;
		}
}

public class method_overloading {

	public static void main(String[] args) {
		calce obj=new calce();
		int r=(obj.cals1(1, 2));
		System.out.println(r);
		int r1=(obj.cals1(1, 2,4));
		System.out.println(r1);
		int r2=(obj.cals1(1, 2,4,5));
		System.out.println(r2);
		
	}


	
}
