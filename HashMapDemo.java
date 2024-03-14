package day12.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapDemo {

	public static void main(String[] args) {
		
//		HashMap<String,Double> emplist=new HashMap();
//		emplist.put("Alice",800.0);
//		emplist.put("Ben",900.0);
//		emplist.put("Chris",1000.0);
//		emplist.put("Dom",1100.0);
//		emplist.put("Elcid",900.0);
//		
//		System.out.println(emplist);
//		
//		Set<String> keys=emplist.keySet();
//		double max=0;
//		for(String key:keys)
//		{
//			if(emplist.get(key)>max)
//				max=emplist.get(key);
//		}
//		
//		System.out.println("Maximum Salary is" + max);
		
//		int arr[]= {10,11,12,13,14};
//		int oddc=0;
//		int evenc=0;
//		
//		for(int n:arr)
//		{
//			if(n%2==0)
//				oddc++;
//			else
//				evenc++;
//		}
//		System.out.println("Number of Odd Elements "+oddc);
//		System.out.println("Number of Even Elements "+evenc);
		
//		int arr[]= {10,11,12,13,14};
//		HashMap<String,Integer> numbers=new HashMap();
//		numbers.put("oddc", 0);
//		numbers.put("evenc", 0);
//		
//		for(int n:arr)
//			{
//				if(n%2==0)
//					numbers.put("evenc",numbers.get("evenc")+1);	
//				else
//					numbers.put("oddc",numbers.get("oddc")+1);
//			}
//		
//		System.out.println("Number of Odd Elements "+numbers.get("oddc"));
//		System.out.println("Number of Even Elements "+numbers.get("evenc"));
			
		HashMap<String,Employee> race100=new HashMap();	
		race100.put("first",new Employee(102,"Alice",5000,23));
		race100.put("second",new Employee(105,"Dom",3000,26));
		race100.put("third",new Employee(104,"Elcid",9000,23));
		
		HashMap<String,Employee> race200=new HashMap();	
		race200.put("first",new Employee(111,"Alex",5000,23));
		race200.put("second",new Employee(115,"Frank",3000,26));
		race200.put("third",new Employee(114,"John",9000,23));
		
		List<HashMap<String,Employee>> olympic=new ArrayList();
		olympic.add(race100);
		olympic.add(race200);
		
		
		//display name of emp who came second in the 200m race
		System.out.println(olympic.get(1).get("second").getEname());
		//display sal of emp who came third in 200m race
		System.out.println(olympic.get(0).get("first").getSal());
//		System.out.println(race100.get("second").getEname());
//		System.out.println(race100.get("third").getAge());
//		
//		System.out.println(race200.get("second").getEname());
//		System.out.println(race100.get("third").getSal());
		
//		System.out.println(race100);
//		System.out.println(race200);
	}

}
