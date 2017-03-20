package service;

import java.util.List;

import domain.User;

public interface UserService {
	void register (User user);
	void selectId(String id);
	List<User> findUserByName(String name);
	User findUserById(String id);
	User findUserAll();
	void deleteUser(String id);
	void updateUser(User user);
}
