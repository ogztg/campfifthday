package campFifthDay.core.concretes;

import campFifthDay.core.abstracts.VerificationService;
import campFifthDay.entities.concretes.User;

public class NameCheck implements VerificationService{

	@Override
	public boolean check(User user) {
		if(user.getUserName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		}else {
			System.out.println("Isminiz iki karakterden az olamaz.");
			return false;
		}
		
	}
	

}
