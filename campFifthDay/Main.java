package campFifthDay;

import java.util.ArrayList;

import campFifthDay.business.abstracts.UserService;
import campFifthDay.business.concretes.UserManager;
import campFifthDay.core.abstracts.VerificationService;
import campFifthDay.core.concretes.EmailCheck;
import campFifthDay.core.concretes.NameCheck;
import campFifthDay.core.concretes.PasswordCheck;
import campFifthDay.dataAccess.concretes.MyUserDao;
import campFifthDay.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		VerificationService[] verificationServices = {new NameCheck(), new PasswordCheck(), new EmailCheck()};
		UserService userService = new UserManager(verificationServices, new MyUserDao(), new ArrayList<User>());
		
		User user = new User("oðuz", "tuð", "ogztg", "oguztug@gmail.com", "123132");
		userService.signUp(user);
		
		User user1 = new User("ali", "veli", "lvl", "oguztug@gmail.com", "123132");
		userService.signIn(user1);
	}

}
