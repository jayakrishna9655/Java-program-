package basic_programs;

class data{
	int age;
	String name;
	int role_num;
}

public class object_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        data ob=new data();
        ob.age=22;
        ob.name="jai";
        ob.role_num=123;
        data ob1=new data();
        ob1.age=25;
        ob1.name="kumar";
        ob1.role_num=345;
        data ob2=new data();
        ob2.age=23;
        ob2.name="ram";
        ob2.role_num=567;
        
        data  d[]=new data[3];
        d[0]=ob;
        d[1]=ob1;
        d[2]=ob2;
        for(data n : d) {
        	System.out.println(n.name +" : "+n.age+" : "+n.role_num);
        }
	}

}
