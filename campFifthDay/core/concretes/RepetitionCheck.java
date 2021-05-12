package campFifthDay.core.concretes;

import java.util.ArrayList;

import campFifthDay.core.abstracts.VerificationService;
import campFifthDay.entities.concretes.User;

public class RepetitionCheck implements VerificationService {
	private ArrayList<String> mailControl;

	public RepetitionCheck(ArrayList<String> mailControl) {
		super();
		this.mailControl = mailControl;
	}

	@Override
	public boolean check(User user) {
		if(this.mailControl.isEmpty()) {
			System.out.println("Email eklendi.");
			this.mailControl.add(user.getEmail());
			return true;
		}else {
			for(String mail : this.mailControl) {
				if(mail == user.getEmail()) {
					System.out.println("Bu email adresi zaten kullaniliyor.");
					return false;
				}
			}
		System.out.println("Email eklendi.");
		this.mailControl.add(user.getEmail());
		return true;
		}
		
	}

}
