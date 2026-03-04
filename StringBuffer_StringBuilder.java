package basic_programs;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb= new StringBuffer("jai");
		System.out.println(sb.insert(0,1));
		System.out.println(sb.hashCode());
		System.out.println(sb.isEmpty());
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
