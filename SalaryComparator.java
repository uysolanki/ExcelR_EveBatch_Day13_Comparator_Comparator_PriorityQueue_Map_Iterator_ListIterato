package day12.collection;

import java.util.Comparator;

public class SalaryComparator implements Comparator<NewEmployee> {

	@Override
	public int compare(NewEmployee o1, NewEmployee o2) {
		if(o1.getSal()==o2.getSal())
			return 0;
		else if(o1.getSal()<o2.getSal())
			return 1;
		else
			return -1;
	}

}
