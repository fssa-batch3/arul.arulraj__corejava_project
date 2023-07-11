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
		
		Logger logger = new Logger();
		
		logger.debug("debug");
		logger.error("error");
		logger.info("info");
		logger.debug(10);
		logger.error(15);
		logger.info(20);
		

	}

}
