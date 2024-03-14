package day12.collection;

import java.util.Comparator;

public class EnoComparator implements Comparator<NewEmployee> {

	@Override
	public int compare(NewEmployee o1, NewEmployee o2) {
		if(o1.getEno()==o2.getEno())
			return 0;
		else if(o1.getEno()>o2.getEno())
			return 1;
		else
			return -1;
	}

}
