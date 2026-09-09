package basic_programs;

public class Xpattern {

	public static void main(String[] args) {
		
		int x=5;
//		01234
//		*   *
//		 * * 
//		  *  
//		 * * 
//		*   *
		
		for(int i=0;i<x;i++) {
		   
			for(int j=0;j<x;j++) {
//				System.out.println("i ="+i+" | j="+j);
//				System.out.println(x-1-i+"x");
				if(j==i || j == x - 1 - i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
