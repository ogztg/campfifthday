package campFifthDay.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import campFifthDay.core.abstracts.VerificationService;
import campFifthDay.entities.concretes.User;

public class PasswordCheck implements VerificationService {
	String passwordRegex =  "^.{6,}$";
	Pattern passwordPattern = Pattern.compile(passwordRegex);
	

	@Override
	public boolean check(User user) {
		Matcher matcher = passwordPattern.matcher(user.getPassword());
		if(matcher.matches()) {
			return true;
		}else {
			System.out.println("Gecersiz parola!!!");
			return false;
		}
		
	}

}
