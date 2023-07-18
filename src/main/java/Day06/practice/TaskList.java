package Day06.practice;

import java.util.ArrayList;

public class TaskList {
	 public static void main(String[] args) {
		 ArrayList<Task> tasks = new ArrayList<>();
	        tasks.add(new Task("Washing car", 0));
	        tasks.add(new Task("Driving Cycle", 0));
	        tasks.add(new Task("Cutting the Tree", 0));

	        boolean exists = findTaskByName("Driving Cycle", tasks);
	        System.out.println("Task Status: " + exists);
	    }

	    public static boolean findTaskByName(String name, ArrayList<Task> tasks) {
	        for (Task task : tasks) {
	            if (task.getTaskName().equals(name)) {
	                return true;
	            }
	        }
	        return false;
	    }
}