package Day05.practice;

public class Department {
	
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptId=" + deptId + "]";
	}

	String deptName;
	int deptId;
	
	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}

}
