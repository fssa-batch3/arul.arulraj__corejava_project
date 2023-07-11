package Day02.misc;


public class Student {
	
	String name;
	int id;
	String email;
	public static String academy;
	static int count = 0 ;
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	static {
		academy = "FSSA";
	}
	public Student() {
		Student.count++;
	}


}
