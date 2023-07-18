package Day05.practice;

public class Student {
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department=" + department.toString() + "]";
	}

	String name;
	int id;
	Department department;

	public Student(String name, int id, Department department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

}
