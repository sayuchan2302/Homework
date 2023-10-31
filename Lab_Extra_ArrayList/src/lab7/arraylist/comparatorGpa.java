package lab7.arraylist;

import java.util.Comparator;

public class comparatorGpa implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getGPA(), o1.getGPA());
	}

}
