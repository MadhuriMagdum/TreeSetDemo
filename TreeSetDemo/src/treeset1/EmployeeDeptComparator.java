package treeset1;

import java.util.*;

public class EmployeeDeptComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
	//	return e1.dp.compareTo(e2.dp);// ascending order
		return -e1.dp.compareTo(e2.dp);// descending order
	}

	
	

	
}
