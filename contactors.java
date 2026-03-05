package basic_programs;

class contactorClass{
	int age;
	String name;
	public contactorClass() {
		
		this.age=18;
		this.name="jai";
		
	}
	public contactorClass(int a ,String n) {
		this.age=a;
		this.name=n;
	}
}

public class contactors {

	public contactors() {
	
		System.out.println("main contractor");
	}

	public static void main(String[] args) {
		
		contactorClass obj = new contactorClass();
		System.out.println(obj.age);
		System.out.println(obj.name);
		contactorClass obj1 = new contactorClass(22,"jayakrishna");
		System.out.println(obj1.age);
		System.out.println(obj1.name);

	}

}
