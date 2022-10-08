package treeset1;

import java.util.Objects;

public class Employee {
int id;
String nm;
String dp;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(int id, String nm, String dp) {
	super();
	this.id = id;
	this.nm = nm;
	this.dp = dp;
}

@Override
public int hashCode() {
	return Objects.hash(dp, id, nm);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(dp, other.dp) && id == other.id && Objects.equals(nm, other.nm);
}

@Override
public String toString() {
	return "Employee [id=" + id + ", nm=" + nm + ", dp=" + dp + "]";
}




}
