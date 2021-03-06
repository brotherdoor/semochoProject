package semo.service;

import java.util.List;

import semo.domain.Good;
import semo.domain.Post;
import semo.domain.User;

public interface AdminService {
	
	List<Post>findAccuseAll();
	void accuseReset(String postId);
	void removePost(String postId);
	void regiserGood(Good good);
	void removeGood(String goodId);
	List<User>registerWinners(int items, String goodId);
	List<User>findUserByName(String name);
	User findUserById(String userId);
	void removeUser(String userId);
	List<String> searchEnterUsers(String goodId);
	
	
	
	

}
