package treeset1;

import java.util.*;

public class Student implements Comparable {
	String nm;

	public Student() {
		super();
	}

	public Student(String nm) {
		super();
		this.nm = nm;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nm);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(nm, other.nm);
	}

	@Override
	public String toString() {
		return "Student [nm=" + nm + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s1 = (Student) o;
			return -this.nm.compareTo(s1.nm);
	//		return s1.nm.compareTo(this.nm);

	}
}
