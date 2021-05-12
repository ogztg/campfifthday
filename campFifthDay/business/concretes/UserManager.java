package campFifthDay.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import campFifthDay.business.abstracts.UserService;
import campFifthDay.core.abstracts.VerificationService;
import campFifthDay.dataAccess.abstracts.UserDao;
import campFifthDay.entities.concretes.User;

public class UserManager implements UserService{
	private VerificationService[] verificationServices;
	private UserDao userDao;
	private ArrayList<User> users;

	public UserManager(VerificationService[] verificationServices, UserDao userDao, ArrayList<User> users) {
		super();
		this.verificationServices = verificationServices;
		this.userDao = userDao;
		this.users = users;
	}

	@Override
	public void signUp(User user) {
		for(VerificationService verificationService : this.verificationServices) {
			if(verificationService.check(user)==false) {
				System.out.println("Kayit islemi basarisiz!! Yeniden deneyin...");
				return;
			}
		}
		
		int verificationCode = (int)(Math.random() * 10000);
		System.out.println(verificationCode);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dogrulama kodunu giriniz: ");
		int verification = scanner.nextInt();
		
		if(verificationCode == verification) {
			System.out.println("Dogrulama islemi basarili.");
		}else {
			System.out.println("Hata!!! Tekrar deneyin.");
		}
		this.userDao.add(user);
		userDao.add(user);
	}

	@Override
	public void signIn(User user) {
		for(User user1 : users) {
			if(user1.getEmail() == user.getEmail() && user1.getPassword() == user.getPassword()) {
				System.out.println("Hosgeldin , " + user1.getUserName());
				return;
			}
		}
		System.out.println("Giris basarisiz...");
		
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}
	

}
