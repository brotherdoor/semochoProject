package semo.service;

import java.util.List;

import semo.domain.User;

public interface UserService {
	
	boolean registerUser(User user);
	boolean searchId(String id);
	List<User> searchUserByName(String name);
	User searchUserById(String id);
	List<User> searchUserAll();
	
	void removeUser(String id);
	void modifyUser(User user);
	void searchFriendById(String id);
	
	
	List<User> searchFriendAll(String userId);
	boolean searchFriend(String userId, String friendId);
	void removeFriend(String userId, String friendId);
	
	User login(User user);


}
