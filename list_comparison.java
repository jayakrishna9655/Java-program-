package basic_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class stuData{
	int age;
	String name;
	public stuData(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		 return "Data: " + age + " " + name;
	}
}

public class list_comparison {

	public static void main(String[] args) {
		
//		Comparator<stuData> com =new Comparator<stuData>() {
//			public int compare(stuData i, stuData j) {
//				// TODO Auto-generated method stub
//				if(i.age>j.age ) {
//					return 1;
//				}
//				else {
//					return -1;
//				}
//			}
//		};
		
		// it is a @FunctionalInterface soo we can use lampda here
		
		Comparator<stuData> com=( i, j) ->  i.age>j.age ?1:-1;
		
		
		List<stuData> s=new ArrayList<stuData>();
		s.add(new stuData(21, "sam"));
		s.add(new stuData(24, "jai"));
		s.add(new stuData(23, "krish"));
		
		Collections.sort(s, com);
		
		for(stuData i :s)
		 System.out.println(i);

	}

}
