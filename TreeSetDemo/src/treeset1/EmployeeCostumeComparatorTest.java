package treeset1;

import java.util.*;

public class EmployeeCostumeComparatorTest {

	public static void main(String[] args) {
		Employee e1=new Employee(103,"Amol","Admin");
		Employee e2=new Employee(104,"Chanda","Account");
		Employee e3=new Employee(102,"Madhu","Staff");
		Employee e4=new Employee(102,"Madhu","Staff");
		Employee e5=new Employee(107,"Ajit","Head Dept");
		
		
//		EmployIdComparable idComp =new EmployIdComparable();
//		TreeSet t1=new TreeSet(idComp);
//		TreeSet t1=new TreeSet(new EmployeeIdComparator()); // optimize

//		EmployNameComparator nmComp=new EmployNameComparator();
//		TreeSet t1=new TreeSet(nmComp);
//		TreeSet t1=new TreeSet(new EmployeeNameComparator()); // optimize
		
//		EmployeeDeptComparator dpComp=new EmployeeDeptComparator();
//		TreeSet t1=new TreeSet(dpComp);
		TreeSet t1=new TreeSet(new EmployeeDeptComparator()); // optimize
		t1.add(e2);
		t1.add(e3);
		t1.add(e1);
		t1.add(e5);
		t1.add(e4);
		System.out.println(t1);
	}

}
