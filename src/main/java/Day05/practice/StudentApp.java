package Day05.practice;

public class StudentApp {

	public static void main(String[] args) {
		Department department = new Department("mech", 532);
		
		System.out.println(department.toString());
		
		Student student = new Student("Ajun", 555, department);
		
		System.out.println(student.toString());
		
	}

}
