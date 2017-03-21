package semo.store.facade;

import java.util.List;

import semo.domain.Comment;
import semo.domain.Post;

public interface PostStore {
//	Comment
	List<Comment> selectComments(String postId);
	void insertComment(String postId, Comment comment);
	void deleteComment(String commentId);
	void deleteCommentByPostId(String postId);
	
//	Post
	List<Post> selectPostByCategory(String category);
	List<Post> selectPostByWriterId(String writerId);
	List<Post> selectPostByTitle(String title);
	Post selectPost(String postId);
	List<Post> selectAllPost();
	void insertPost(Post post);
	void updatePost(Post post);
	void deletePost(String postId);
	
//	Alaming
	List<String> selectAlaming(String userId);
	void insertAlaming(String userId, String postId);
	void deleteAlaming(String userId, String postId);
	
//	Accuse
	List<String> selectContentByAccuse(String postId);
	boolean checkAccuse(String postId, String userId);
	void registerAcuuse(String postId, String writerId, String content);
	void deleteAccuse(String postId);
	void updateAccuseTb(String postId);
	
}
