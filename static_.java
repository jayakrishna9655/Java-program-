package basic_programs;

class datass{
	int age;
    static	String name;
    
	 void display() {
		System.out.println( age +" : "+name);
	}
	 
	datass(){
		System.out.println("class from con");
	}
	
	static {
		System.out.println("class from static");
	}
	
	public static void displays(datass d1) {
		System.out.println("method from static");
		System.out.println(d1.age +" : "+name);
	}
}

public class static_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static variable
		datass d = new datass();
		d.age=18;
		datass.name="jaia";
		
		
		datass d1 = new datass();
		d1.age=20;
		datass.name="jai";
		d.display();
		d1.display();
		datass.displays(d1);
		
		
	}

}
