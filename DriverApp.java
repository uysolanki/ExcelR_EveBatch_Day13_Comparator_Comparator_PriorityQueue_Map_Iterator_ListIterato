package day12.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverApp {

	public static void main(String[] args) {
//		List<Integer> numbers=new ArrayList();
//		numbers.add(19);
//		numbers.add(10);
//		numbers.add(17);
//		numbers.add(8);
//		numbers.add(13);
//		System.out.println("Before Sorting "+ numbers);
//		Collections.sort(numbers);
//		System.out.println("After Sorting "+ numbers);
//		
//		List<String>  names=new ArrayList();
//		names.add("Chris");
//		names.add("Alice");
//		names.add("Ben");
//		names.add("Dom");
//		names.add("Elcid");
//		System.out.println("Before Sorting "+ names);
//		Collections.sort(names);
//		System.out.println("After Sorting "+ names);
		
		List<Employee> workers=new ArrayList();
		workers.add(new Employee(103,"Ben",8000,29));
		workers.add(new Employee(101,"Chris",6000,21));
		workers.add(new Employee(102,"Alice",5000,22));
		workers.add(new Employee(105,"Dom",3000,26));
		workers.add(new Employee(104,"Elcid",9000,23));
		System.out.println("Names Before Sorting");
		for(Employee w:workers)
		{
			System.out.print(w.getEname()+",");
		}//Ben,Chris,Alice,Dom,Elcid
		System.out.println("");
		Collections.sort(workers);
		System.out.println("Names After Sorting");
		for(Employee w:workers)
		{
			System.out.print(w.getEname()+",");
		}//Chris,Alice,Ben,Elcid,Dom
		
	}

}
