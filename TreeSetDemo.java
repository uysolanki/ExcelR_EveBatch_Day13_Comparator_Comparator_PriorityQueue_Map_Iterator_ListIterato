package day12.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
//		TreeSet<Employee> workers=new TreeSet();
//		
//		workers.add(new Employee(103,"Ben",8000,29));
//		workers.add(new Employee(101,"Chris",6000,21));
//		workers.add(new Employee(102,"Alice",5000,22));
//		workers.add(new Employee(105,"Dom",3000,26));
//		workers.add(new Employee(104,"Elcid",9000,23));
//		
//		System.out.println(workers);
		
TreeSet<NewEmployee> workers=new TreeSet(new SalaryComparator());
		
		workers.add(new NewEmployee(103,"Ben",8000,29));
		workers.add(new NewEmployee(101,"Chris",6000,21));
		workers.add(new NewEmployee(102,"Alice",5000,22));
		workers.add(new NewEmployee(105,"Dom",3000,26));
		workers.add(new NewEmployee(104,"Elcid",9000,23));
		
		System.out.println(workers);

	}

}
