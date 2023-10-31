package lab7.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class Clazz {
	private String name;
	private String year;// 2017, 2018, 2019, ...
	private ArrayList<Student> students = new ArrayList<Student>();

	public Clazz(String name, String year) {
		this.name = name;
		this.year = year;
	}

	public Clazz(String name, String year, ArrayList<Student> students) {
		this.name = name;
		this.year = year;
		this.students = students;
	}

	// sort students according to the given comparator c
	public void sortStudents(Comparator<Student> c) {
		students.sort(c);
	}

	// get top n students with highest GPA
	public ArrayList<Student> getTopNStudents(int n) {
		// TODO
		if (n == 0)
			return null;
		ArrayList<Student> sortedStudents = new ArrayList<Student>(students);
		sortedStudents.sort(new comparatorGpa());
		ArrayList<Student> topStudents = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			topStudents.add(sortedStudents.get(i));
		}
		return topStudents;
	}

	// get random n students from the list of students
	public ArrayList<Student> getRandomNStudents(int n) {
		// TODO
		if (n < 0 || n > students.size()) {
			return null;
		}
		ArrayList<Student> randomStudents = new ArrayList<Student>();
		Random rd = new Random();

		ArrayList<Integer> randomNumber = new ArrayList<Integer>();
		for (int i = 0; i < students.size(); i++) {
			randomNumber.add(i);
		}
		for (int i = 0; i < n; i++) {
			int randomIndex = rd.nextInt(randomNumber.size());
			int studentIndex = randomNumber.remove(randomIndex);
			randomStudents.add(students.get(studentIndex));
		}
		return randomStudents;
	}

// remove a student with a given id
	public boolean removeStudent(String id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				students.remove(i);
				return true;
			}
		}
		return false;
	}

	// get all students who were born in a given birth year.
	public ArrayList<Student> getStudentByBirthYear(int birthYear) {
		// TODO
		ArrayList<Student> studentsByBirthYear = new ArrayList<>();

		for (Student student : students) {
			if (student.getBirthYear() == birthYear) {
				studentsByBirthYear.add(student);
			}
		}

		return studentsByBirthYear;
	}

	// similar as toString method, this method prints the name, year, and all
	// students of the class. Note that, using iterator
	public void display() {
		Iterator<Student> listIter = students.iterator();
		while (listIter.hasNext()) {
			Student student = listIter.next();
			System.out.println(student.toString());
		}
	}

	public void display(ArrayList<Student> students) {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
