package semo.store.facade;

import java.util.List;

import semo.domain.User;

public interface UserStore {
	
	void registerUser(User user);
	int checkId(String id);
	List<User> searchUserByName(String name);
	User searchUserById(String id);
	List<User> searchUserAll();
	
	void removeUser(String id);
	void modifyUser(User user);
	User searchFriendById(String id);
	
	List<User> searchFriendAll(String userId);
	int searchFriend(String userId, String friendId);
	void removeFriend(String userId, String friendId);

}

