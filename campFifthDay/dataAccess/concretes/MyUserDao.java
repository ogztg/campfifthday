package campFifthDay.dataAccess.concretes;

import campFifthDay.dataAccess.abstracts.UserDao;
import campFifthDay.entities.concretes.User;

public class MyUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanici sisteme eklendi: " + user.getUserName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullaici sistemden silindi: " + user.getUserName());
		
	}

	@Override
	public void update(User user) {
		
		
	}

}
