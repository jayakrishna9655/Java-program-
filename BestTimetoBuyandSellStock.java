package basic_programs;

public class BestTimetoBuyandSellStock {
	
	public static void main(String[] args) {
		
		int[] prices = {7,6,4,3,1};
		
		int min=prices[0];
		int max=0;
		for(int i =0;i<prices.length;i++) {
			
			if(prices[i]<min) {
				min=prices[i];
			}
			else {
				int sum= prices[i] - min;
				if(sum>max) {
				max=sum;
			}
			}
			
		}
		
		System.out.println("max ="+max +" - "+" min ="+min);
		
	}

}
