<<<<<<< HEAD
<<<<<<< HEAD
package service;

import java.util.List;

import domain.Choice;
import domain.Comment;
import domain.Post;

public interface PostService {
	
	List<Comment> searchChoice(Choice choice);
	
	void registerComment(Comment comment, String postId);
	void removeComment(String commentId);
	
	List<Post> searchPostsByCategory(String Category);
	List<Post> searchPostsByWriterId(String writerId);
	Post searchPostById(String postId);
	List<Post> searchPostsByTitle(String title);
	List<Post> searchAllPosts();
	void registerPost(Post post);
	void removePost(String postId);
	
	List<Post> searchByAlaming(String userId);
	void registerAlaming(String userId, String postId);
	void removeAlaming(String userId, String postId);
	
	

}
=======

package service;

import java.util.List;

import domain.Choice;
import domain.Comment;
import domain.Post;

public interface PostService {
	
	List<Comment> searchChoice(Choice choice);
	
	void registerComment(Comment comment, String postId);
	void removeComment(String commentId);
	
	List<Post> searchPostsByCategory(String Category);
	List<Post> searchPostsByWriterId(String writerId);
	Post searchPostById(String postId);
	List<Post> searchPostsByTitle(String title);
	List<Post> searchAllPosts();
	void registerPost(Post post);
	void removePost(String postId);
	
	List<Post> searchByAlaming(String userId);
	void registerAlaming(String userId, String postId);
	void removeAlaming(String userId, String postId);
	
	

}

>>>>>>> branch 'master' of https://github.com/brotherdoor/semochoProject.git
=======

package service;

import java.util.List;

import domain.Choice;
import domain.Comment;
import domain.Post;

public interface PostService {
	
	void registerComment(Comment comment, String postId);
	List<Post> searchPostsByCategory(String Category);
	List<Post> searchPostsByWriterId(String writerId);
	List<Post> searchAllPosts();
	List<Comment> searchChoice(Choice choice);
	void registerPost(Post post);
	void removePost(String postId);
	void modifyPost(Post post);
	
	List<Post> searchByAlaming(String userId);
	void registerAlaming(String userId, String postId);
	void removeAlaming(String userId, String postId);
	
	
	
	
	void removeComment(String commentId);
	
	
	
	Post searchPostById(String postId);
	List<Post> searchPostsByTitle(String title);
	
	
	
	
	
	
	List<Post> 
	
	

}

>>>>>>> branch 'master' of https://github.com/brotherdoor/semochoProject.git
