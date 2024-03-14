package day12.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day10.collection.NameComparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<NewEmployee> workers=new ArrayList();
		workers.add(new NewEmployee(103,"Ben",8000,29));
		workers.add(new NewEmployee(101,"Chris",6000,21));
		workers.add(new NewEmployee(102,"Alice",5000,22));
		workers.add(new NewEmployee(105,"Dom",3000,26));
		workers.add(new NewEmployee(104,"Elcid",9000,23));
		
		System.out.println("Before Sorting");
		for(NewEmployee e:workers)
			System.out.println(e.getEname());
		
		Collections.sort(workers,new EnameComparator());
		
		System.out.println("After Sorting on ENO");
		for(NewEmployee e:workers)
			System.out.println(e.getEname());
		

	}

}
