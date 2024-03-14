package day12.collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<NewEmployee>{

	@Override
	public int compare(NewEmployee o1, NewEmployee o2) {
		if(o1.getAge()==o2.getAge())
			return 0;
		else if(o1.getAge()>o2.getAge())
			return 1;
		else
			return -1;
	}

	

}
