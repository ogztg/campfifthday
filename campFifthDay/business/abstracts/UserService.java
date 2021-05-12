package campFifthDay.business.abstracts;

import java.util.List;

import campFifthDay.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);
	List<User> getAll();

}
