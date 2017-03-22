package semo.service;

import java.util.List;

import semo.domain.Comment;
import semo.domain.Post;

public interface PostSevice {
	
	//�Խù����
	void registerComment(String postId, Comment comment);
	Post searchPostByPostId(String postId);
	List<Post> searchByCategory(String category);
	List<Post> searchByWriterId(String writerId);
	List<Post> searchByTitle(String title);
	List<Post> searchAllPost();
	void registerPost(Post post);
	void removePost(String postId);
	void modifyPost(Post post);
	
	//�˶�̱��
	List<Post> searchAlaming(String userId);
	void registerAlaming(String userId, String postId);
	void removeAlaming(String userId, String postId);
	
	//�Ű���
	List<Post> searchByAccuse();
	void registerAccuse(String postId, String writerId, String content);
	void removeAccuse(String postId);
	List<String> searchAccuseContent(String postId);
	
}
