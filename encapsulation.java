package basic_programs;

class encapsulation_data{
	private int age;
	private String name;
	
	String getname() {
		
		return name;
	}
    int getage() {
		
		return age;
	}
    
    void setName(String n) {
    	name =n;
    	System.out.println(name);
    }
    void setage(int a) {
    	age =a;
    	System.out.println(age);
    }
	
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        encapsulation_data en=new encapsulation_data();
   
        en.setName("jai");
        en.setage(18);
        en.getage();
        en.getname();
        
	}

}
