package basic_programs;

class count{
	int count ;
	public void data(){
		count++;
	}
}

public class threadCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       count c=new count();
		Runnable r=()-> {
			for(int i =0;i<100;i++) {
				c.data();
				//System.out.println(c.count);
			}
			};
			
		Runnable r1= () ->{
			for(int i =0;i<100;i++) {
				c.data();
			}
		};
		
	   Thread t1=new Thread(r);
	   Thread t2=new Thread(r1);
	   t1.start();
	   t2.start();
	   t1.join();
	   t2.join();
		
	   System.out.println(c.count);
		
	}
  

}
