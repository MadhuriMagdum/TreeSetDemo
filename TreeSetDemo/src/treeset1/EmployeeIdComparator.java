package treeset1;

import java.util.*;

public class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.id==e2.id)
				return 0;
		else if(e1.id > e2.id)
				//return 1; // ascending order
		        return -1; // descending order
		else
			//	return -1; // ascending order
		        return 1; // descending order
	}

}
