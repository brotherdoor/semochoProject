
package store;

import java.util.List;

import domain.User;

public interface UserStore {
	
	void insertUser(User user);
	boolean checkId(String id);
	
	List<User> selectUserByName(String name);
	List<User> selectUserById(String id);
	List<User> selectAllUser();
	
	void deleteUser(String id);
	void updateUser(User user);
	
	User checkFriendById(String friendId);
	List<User> selectAllFriend(String userId);
	void insertFriend(String userId, String friendId);
	void deleteFriend(String userId, String friendId);

}

