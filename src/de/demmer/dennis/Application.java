package de.demmer.dennis;


public class Application {
	
	public static void main(String[] args) {
	
		
		UserManager userManager = new UserManager();
		userManager.signUp("12345", "Dennis");
		

		System.out.println(userManager.login("Dennis", "123457777"));

		
	}

}
