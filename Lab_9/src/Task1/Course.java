package Task1;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String id;
	private String title;
	private String type;
	private List<Student> students = new ArrayList<Student>();
	private String lecturer;

	public Course(String id, String title, String type, List<Student> students, String lecturer) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.students = students;
		this.lecturer = lecturer;
	}

	public int sizeArray() {
		return this.students.size();
	}

	public List<Student> getStudents() {
		return students;
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return id + ", title: " + title + ", type: " + type + " lecturer: " + lecturer + "\n" + "List stu: "
				+ students.toString();
	}

}
