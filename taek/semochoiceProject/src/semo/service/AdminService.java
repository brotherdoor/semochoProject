package semo.service;

import java.util.List;

import semo.domain.Good;
import semo.domain.Post;
import semo.domain.User;

public interface AdminService {

	
	List<Post> findAccuseAll();
	List<String> findAccuseContents(String postId);
	void accuseReset(String postId);
	void removePost(String postId);
	void registerGood(Good good);
	void removeGood(Good goodId);
	List<String> registerWinnner(int items);
	List<User> findUserByName(String name);
	User findUserById(String userId);
	void removeUser(String userId);
	
	
	
	
	
	
	
}
