package Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Faculty {
	private String name;
	private String address;
	private List<Course> courses = new ArrayList<Course>();

	public Faculty(String name, String address, List<Course> courses) {
		super();
		this.name = name;
		this.address = address;
		this.courses = courses;
	}

	public Course getMaxPracticalCourse() {
		int max = 0;
		Course result = null;
		for (Course course : courses) {
			if (course.sizeArray() > max) {
				max = course.sizeArray();
				result = course;
			}
		}
		return result;
	}

	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> result = new HashMap<>();

		for (Course course : courses) {
			List<Student> students = course.getStudents();
			for (Student stu : students) {
				int year = stu.getYear();

				if (result.containsKey(year)) {
					result.get(year).add(stu);
				} else {
					List<Student> newStudentList = new ArrayList<Student>();
					newStudentList.add(stu);
					result.put(year, newStudentList);

				}
			}
		}

		return result;
	}

//	public Set<Course> filterCourses(String type) {
//		Set<Course> filteredCourses = new HashSet<>();
//		
//		for (Course course : courses) {
//			if (course.getType().equals(type)) {
//				filteredCourses.add(course);
//			}
//		}
//		List<Course> convertList = new ArrayList<>(filteredCourses);
//		Comparator<Course> compa = new Comparator<Course>() {
//
//			@Override
//			public int compare(Course o1, Course o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o2.sizeArray(), o1.sizeArray());
//			}
//		};
//		Collections.sort(convertList, compa);
//		return new HashSet<>(convertList);
//	}
	public Set<Course> filterCourses(String type) {
		Set<Course> sorted = new TreeSet<>(Comparator.comparingInt(o -> -o.getStudents().size()));
		for (Course course : courses) {
			if (course.getType().equals(type)) {
				sorted.add(course);
			}
		}
		return sorted;
	}
}
