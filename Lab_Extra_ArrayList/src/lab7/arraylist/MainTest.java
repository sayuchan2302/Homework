package lab7.arraylist;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainTest {
	public static void main(String[] args) {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath() + "\\src\\students.txt";
		Clazz clazz;
		try {
			clazz = new Clazz("CNTT", "2022", StudentUtils.loadStudents(s));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		clazz.display();
		clazz.sortStudents(new comparatorGpa());
		System.out.println("=======================================================");
		System.out.println("SORTED: ");
		clazz.display();
		System.out.println("=======================================================");
		System.out.println("TOP 3 GPA: ");
		clazz.display(clazz.getTopNStudents(3));
		System.out.println("=======================================================");
		System.out.println("RANDOM 3 STU: ");
		clazz.display(clazz.getRandomNStudents(3));
		System.out.println("=======================================================");
		System.out.println("REMOVE STU ID :18130090 ");
		System.out.println(clazz.removeStudent("18130090"));
		System.out.println("=======================================================");
		System.out.println("GET STU YEAR OF BIRTH: 1998");
		clazz.display(clazz.getStudentByBirthYear(1998));
		
	}
}