package basic_programs;

class threadData1 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("hi");
		}
	}
}
class threadData2 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("jai");
		}
	}
}
public class threads {

	public static void main(String[] args) {
		threadData1 obj1=new threadData1();
		threadData2 obj2=new threadData2();
		obj1.start();
		obj2.start();
	}
	
}
