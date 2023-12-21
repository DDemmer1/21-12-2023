package de.demmer.dennis;

public class UserManager {

	User[] allUsers;
	int nextUser = 0;

	public UserManager(int initialSize) {
		allUsers = new User[initialSize];
	}

	public UserManager() {
		allUsers = new User[150];
	}

	public User login(String name, String pw) {

		for (int i = 0; i < allUsers.length; i++) {
			User user = allUsers[i];

			if (user != null) {
				if (user.name.equals(name) && user.pw.equals(pw)) {
					return user;
				}
			}

		}

		return null;
	}

	public void signUp(String pw, String userName) {
		User user = new User(userName, pw);
		allUsers[nextUser] = user;
		nextUser++;
	}

}
