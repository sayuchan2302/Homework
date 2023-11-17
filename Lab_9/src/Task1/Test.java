package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		// Creating students
		Student s1 = new Student("01", "Ngoc Thinh", 2004);
		Student s2 = new Student("02", "Ngoc Yen", 2004);
		Student s3 = new Student("03", "Ngoc Thach", 2006);
		Student s4 = new Student("04", "Ngoc Thien", 2002);
		Student s5 = new Student("05", "Bao Ngoc", 2000);

		// Creating course lists
		List<Student> list1 = new ArrayList<>();
		List<Student> list2 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		list1.add(s5);
		list2.add(s1);
		list2.add(s2);
		list2.add(s3);

		// Creating courses
		Course c1 = new Course("789", "Data", "practice", list1, "Java 8");
		Course c2 = new Course("103", "Design", "design", list2, "Auto CAD");

		// Creating a list of courses
		List<Course> courses = new ArrayList<>();
		courses.add(c1);
		courses.add(c2);

		// Creating a faculty
		Faculty f1 = new Faculty("CNTT", "NLU", courses);

		// Testing getMaxPracticalCourse method
		System.out.println("Max Practical Course:");
		System.out.println(f1.getMaxPracticalCourse());
		System.out.println("===========================");

		// Testing groupStudentsByYear method
		System.out.println("Students Grouped by Year:");
		Map<Integer, List<Student>> studentsByYear = f1.groupStudentsByYear();
		studentsByYear.forEach((year, studentList) -> {
			System.out.println("Year " + year + ": " + studentList);
		});
		System.out.println("===========================");
		System.out.println("Filtered Courses (Type: practice) - Sorted by Number of Students:");
		System.out.println(f1.filterCourses("practice"));
	}
}