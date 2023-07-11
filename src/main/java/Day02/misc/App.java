package Day02.misc;

import Day02.solved.Calculator;

public class App {

	public static void main(String[] args) {
		Academy academy = new Academy();
		
		academy.setName("Fresh Works");
		academy.setId(2011);
		academy.setCode("FSSA");
		
		Student student = new Student();
		
		student.setName("Arul Ajun");
		student.setId(555);
		student.setEmail("ajundcruzz55@gmail.com");
		System.out.println(Student.count);
		
		Student student1 = new Student();
		
		student1.setName("Sugu");
		student1.setId(556);
		student1.setEmail("sugu66@gmail.com");
		System.out.println(Student.count);
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));           // Output: 5
		System.out.println(calc.add(2.5, 3.7));       // Output: 6.2
		System.out.println(calc.add("Hello", "World"));  // Output: HelloWorld

	}

}
