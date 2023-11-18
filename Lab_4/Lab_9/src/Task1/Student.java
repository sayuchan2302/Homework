package Task1;

public class Student {
	private String id;
	private String name;
	private int year;

	public Student(String id, String name, int year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "id:" + id + " name=" + name + " year=" + year ;
	}
	public boolean equalYear (int year) {
		return this.year == year ;
	}
}
