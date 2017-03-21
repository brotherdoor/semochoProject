package service;

import java.util.List;

import domain.Comment;
import domain.Post;

public interface PostSevice {
	
	//�Խù����
	void registerComment(String postId, Comment comment);
	Post searchPostByPostId(String postId);
	List<Post> searchByCategory(String category);
	List<Post> searchByWriterId(String WriterId);
	List<Post> searchByTitle(String title);
	List<Post> searchAllPost();
	void registerPost(Post post);
	void removePost(String postId);
	void modifyPost(Post post);
	
	//�˶�̱��
	List<Post> registerAlaming(String postId);
	void registerAlaming(String userId, String postId);
	void removeAlaming(String userId, String postId);
	
	//�Ű���
	List<Post> searchByAccuse(String postId);
	void registerAccuse(String postId, String writerId, String content);
	void removeAccuse(String postId);
	List<String> searchAccuseContent(String postId);
	
}
