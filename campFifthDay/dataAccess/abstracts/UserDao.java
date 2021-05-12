package campFifthDay.dataAccess.abstracts;

import campFifthDay.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);

}
