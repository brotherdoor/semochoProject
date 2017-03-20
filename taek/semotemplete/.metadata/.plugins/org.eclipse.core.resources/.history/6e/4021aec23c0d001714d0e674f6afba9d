package semo.store.facade;

import java.util.List;

import semo.domain.User;

public interface UserService {
	
	void insertUser(User userId);
	void selectedId(String id);
	List<User> selectUserByName(String name);
	User selectUserById(String id);
	User selectUserAll();
	
	void removeUser(String id);
	void modifyUser(User user);
	User selectedFriendById(String id);
	List<User> selectFriendAll(String userId);
	void searchFriend(String userId, String friendId);
	void removeFriend(String userId, String friendId);
	

}
