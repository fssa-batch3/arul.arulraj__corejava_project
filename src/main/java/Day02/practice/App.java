package Day02.practice;

public class App {

	public static void main(String[] args) {
		User user = new User();
		
		user.setName("Arul Ajun");
		user.setId(55);
		user.setEmailId("ajundcruzz55@gmail.com");
		user.setPassword("ajunajun55");
		
		System.out.println(user.getName());
		System.out.println(user.getId());
		System.out.println(user.getEmailId());
		System.out.println(user.getPassword());

		
		Logger.debug("debug");
		Logger.error("error");
		Logger.info("info");
		Logger.debug(10);
		Logger.error(15);
		Logger.info(20);
		

	}

}
