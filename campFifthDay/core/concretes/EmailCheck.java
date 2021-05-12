package campFifthDay.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import campFifthDay.core.abstracts.VerificationService;
import campFifthDay.entities.concretes.User;

public class EmailCheck implements VerificationService {
	String emailRegex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
	Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean check(User user) {
		Matcher matcher = emailPattern.matcher(user.getEmail());
		if(matcher.matches()) {
			return true;
		}else {
			System.out.println("Gecersiz Email.");
			return false;
		}
		
	}

}
