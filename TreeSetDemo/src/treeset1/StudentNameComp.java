package treeset1;

import java.util.*;

public class StudentNameComp {

	public static void main(String[] args) {
		Student s1 = new Student("AA");
		Student s2 = new Student("CC");
		Student s3 = new Student("DD");
		Student s4 = new Student("BB");
		Student s5 = new Student("CC");

//		TreeSet t=new  TreeSet();// default natural ascending order
//		t.add(s2);
//		t.add(s3);
//		t.add(s1);
//		t.add(s4);
//		t.add(s5);
//		System.out.println(t);

//		DescendingStudentComparable obj= new DescendingStudentComparable();
		TreeSet t = new TreeSet(); // custome Descending order
		t.add(s2);
		t.add(s3);
		t.add(s1);
		t.add(s5);
		t.add(s4);

		System.out.println(t);
	}

}
