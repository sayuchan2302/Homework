package Task1;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("01", "Ngoc Thinh", 2004);
		Student s2 = new Student("02", "Ngoc Yen", 2004);
		Student s3 = new Student("03", "Ngoc Thach", 2006);
		Student s4 = new Student("04", "Ngoc Thien", 2002);
		Student s5 = new Student("05", "Bao Ngoc", 2000);
		List<Student> list1 = new ArrayList<Student>();
		List<Student> list2 = new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		list2.add(s1);
		list2.add(s2);
		list2.add(s3);
		Course c1 = new Course("789", "Data", "practice", list1, "Java 8");
		Course c2 = new Course("103", "Design", "design", list1, "Auto cad");
		List<Course> courses = new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		Faculty f1 = new Faculty("CNTT", "NLU", courses);
		System.out.println("MaxPracticalCourse: "+"\n"+f1.getMaxPracticalCourse());
		System.out.println("===========================");
		System.out.println(f1.groupStudentsByYear());
		System.out.println("===========================");
		System.out.println(f1.filterCourses("practice"));
		
	}
}
