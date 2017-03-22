package semo.store.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import semo.domain.Comment;
import semo.domain.Post;

public interface PostMapper {
//	Comment
	List<Comment> selectComments(int postId);
	void insertComment(Map<String, Object> map);
	void deleteComment(int commentId);
	void deleteCommentByPostId(int postId);
	
//	Post
	List<Post> selectPostByCategory(String category);
	List<Post> selectPostByWriterId(String writerId);
	List<Post> selectPostByTitle(Map<String, String> map);
	Post selectPost(int postId);
	List<Post> selectAllPost();
	int insertPost(Post post);
	void updatePost(Post post);
	void deletePost(int postId);
	
//	Alaming
	List<String> selectAlaming(String userId);
	void insertAlaming(Map<String, Object> map);
	void deleteAlaming(Map<String, Object> map);
	
//	Accuse
	List<String> selectContentByAccuse(int postId);
	String checkAccuse(Map<String, Object> map);
	void registerAccuse(Map<String, Object> map);
	void deleteAccuse(int postId);
	void updateAccusePostTb(int postId);

}
