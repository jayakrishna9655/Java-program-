package basic_programs;

//class threadData1 extends Thread{
//	public void run() {
//		for(int i=0;i<100;i++) {
//			System.out.println("hi");
//		}
//	}
//}
//class threadData2 extends Thread{
//	public void run() {
//		for(int i=0;i<100;i++) {
//			System.out.println("jai");
//		}
//	}
//}

class threadData1 implements Runnable{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class threadData2 implements Runnable{
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
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
	}
}
