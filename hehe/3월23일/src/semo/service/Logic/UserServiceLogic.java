package semo.service.Logic;

import java.util.List;

import semo.domain.User;
import semo.service.UserService;
import semo.store.facade.UserStore;
import semo.store.logic.UserStoreLogic;

public class UserServiceLogic implements UserService{

	private UserStore userStore;
	
	public UserServiceLogic(){
		userStore = new UserStoreLogic();
	}
	@Override
	public boolean registerUser(User user) {
		
		return userStore.registerUser(user);
	}

	@Override
	public boolean searchId(String id) {
		
		return userStore.checkId(id) > 0;
	}

	@Override
	public List<User> searchUserByName(String name) {
		// TODO Auto-generated method stub
		return userStore.searchUserByName(name);
	}

	@Override
	public User searchUserById(String id) {
		
		return userStore.searchUserById(id);
	}

	@Override
	public List<User> searchUserAll() {

		return userStore.searchUserAll();
	}

	@Override
	public void removeUser(String id) {
		userStore.removeUser(id);
	}

	@Override
	public void modifyUser(User user) {

		userStore.modifyUser(user);
	}

	@Override
	public void searchFriendById(String id) {
		// TODO Auto-generated method stub
		//??????????????????????????????????
	}

	@Override
	public List<User> searchFriendAll(String userId) {
		// TODO Auto-generated method stub
		return userStore.searchFriendAll(userId);
	}

	@Override
	public boolean searchFriend(String userId, String friendId) {
		// TODO Auto-generated method stub
		return userStore.searchFriend(userId, friendId);
	}

	@Override
	public void removeFriend(String userId, String friendId) {
		 
		userStore.removeFriend(userId, friendId);
		
	}
	@Override
	public User login(User user) {
		User login = user;
		User find = userStore.searchUserById(login.getId());
		if(find.getPassword().equals(login.getPassword())){
			return find;
		}else{
			return null;
		}
	
	}


}
