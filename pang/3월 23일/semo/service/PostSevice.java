package semo.service;

import java.util.List;

import semo.domain.Comment;
import semo.domain.Post;

public interface PostSevice {
	
	//게시물기능
	void registerComment(String postId, Comment comment);
	Post searchPostByPostId(String postId);
	List<Post> searchByCategory(String category);

	List<Post> searchByWriterId(String writerId);
	List<Post> searchByTitle(String title);
	List<Post> searchAllPost();
	void registerPost(Post post);
	void removePost(String postId);
	void modifyPost(Post post);
	
	boolean registerVote(String postId, String choiceId, String userId);
	
	//알라미기능
	List<Post> searchAlaming(String userId);
	void registerAlaming(String userId, String postId);
	void removeAlaming(String userId, String postId);
	
	//신고기능
	void registerAccuse(String postId, String writerId, String content);
	List<Comment> searchAccuseContent(String postId);
	
}
