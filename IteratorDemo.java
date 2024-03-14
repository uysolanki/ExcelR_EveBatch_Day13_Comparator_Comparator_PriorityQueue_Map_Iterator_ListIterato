package day12.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {

		List<String>  names=new ArrayList();
		names.add("Chris");
		names.add("Alice");
		names.add("Ben");
		names.add("Dom");
		names.add("Elcid");
		
		Iterator<String> list=names.iterator();
		while(list.hasNext())
			System.out.println(list.next());
	
	}

}
