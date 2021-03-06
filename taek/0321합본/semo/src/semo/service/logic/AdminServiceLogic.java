package semo.service.logic;

import java.util.List;

import semo.domain.Good;
import semo.domain.Post;
import semo.domain.User;
import semo.service.AdminService;
import semo.service.GoodService;
import semo.store.logic.ChoiceStoreLogic;
import semo.store.logic.GoodStoreLogic;
import semo.store.logic.PostStoreLogic;
import semo.store.logic.UserStoreLogic;

public class AdminServiceLogic implements AdminService{
	
	private GoodStoreLogic goodStore;
	private UserStoreLogic userStore;
	private PostStoreLogic postStore;
	
	
	public AdminServiceLogic() {
		
		goodStore = new GoodStoreLogic();
		userStore = new UserStoreLogic();
		postStore = new PostStoreLogic();
		
	}
	

	@Override
	public List<Post> findAccuseAll() {
		
		List<Post> list = null;
		
		
		list = postStore.selectAllPost();
		
		
		
		
		
		
		return null;
	}

	@Override
	public List<String> findAccuseContents(String postId) {
		return null;
	}

	@Override
	public void accuseReset(String postId) {
		
	}

	@Override
	public void removePost(String postId) {
		
	}

	@Override
	public void regiserGood(Good good) {
		
	}

	@Override
	public void removeGood(String goodId) {
		
	}

	@Override
	public List<User> registerWinners(int items) {
		return null;
	}

	@Override
	public User findUserById(String userId) {
		return null;
	}

	@Override
	public void removeUser(String userId) {
		
	}
	
	
	
	

}
