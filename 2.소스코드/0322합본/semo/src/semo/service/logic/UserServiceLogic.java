package semo.service.logic;

import java.util.List;

import semo.domain.User;
import semo.service.UserService;
import semo.store.logic.UserStoreLogic;

public class UserServiceLogic implements UserService{
	private UserStoreLogic store;
	
	
	public UserServiceLogic() {
		
		store = new UserStoreLogic();
	}

	@Override
	public void registerUser(User userId) {
		store.registerUser(userId);
	}

	@Override
	public void searchId(String id) {
		store.searchUserById(id);
	}

	@Override
	public List<User> searchUserByName(String name) {

		return store.searchUserByName(name);
	}

	@Override
	public User searchUserById(String id) {
		return store.searchUserById(id);
	}

	@Override
	public List<User> searchUserAll() {
		
		return store.searchUserAll();
	}

	@Override
	public void removeUser(String id) {
		store.removeUser(id);
	}

	@Override
	public void modifyUser(User user) {

		store.modifyUser(user);
	}

	@Override
	public User searchFriendById(String id) {
		return store.searchUserById(id);
	}

	@Override
	public List<User> searchFriendAll(String userId) {
		return store.searchFriendAll(userId);
	}

	@Override
	public void searchFriend(String userId, String friendId) {

		store.searchFriend(userId, friendId);
	}

	@Override
	public void removeFriend(String userId, String friendId) {

		store.removeFriend(userId, friendId);
	}

}
