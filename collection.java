package basic_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		List<Integer> l=new ArrayList<Integer>(); //list allow duplicates
		l.add(1);
		l.add(3);
		l.add(2);
		l.add(5);
		l.add(4);
		l.add(6);
		l.add(6);
		Collections.sort(l);
		for(int i : l) {
		  System.out.println(i);
		}
		Set<Integer> set =new HashSet<Integer>(); // set not allow duplicates
		System.out.println("------------------------------------------");
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(44);
		set.add(6);
		set.add(6);
		
		for(int i : set) {
		 System.out.println(i);
		}
		Set<Integer> tset =new TreeSet<Integer>(); // set not allow duplicates
		System.out.println("------------------------------------------");
		tset.add(1);
		tset.add(3);
		tset.add(2);
		tset.add(5);
		tset.add(4);
		tset.add(6);
		tset.add(6);
		
		for(int j : tset) {
		  System.out.println(j);
		}
	
		
		Map<Integer, String> m= new HashMap<Integer, String>();
		m.put(1, "jai");
		m.put(2, "krish");
		m.put(3, "sam");
		
		System.out.println(m);
		
		for(Integer i : m.keySet()) {
			System.out.println(i +" "+ m.get(i));
		}
		
	}

}
