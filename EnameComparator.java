package day12.collection;

import java.util.Comparator;

public class EnameComparator implements Comparator<NewEmployee> {

	@Override
	public int compare(NewEmployee o1, NewEmployee o2) {
		return(o1.getEname().compareTo(o2.getEname()));
	}

}
