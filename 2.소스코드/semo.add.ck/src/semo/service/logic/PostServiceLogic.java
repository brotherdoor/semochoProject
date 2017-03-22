package semo.service.logic;

import java.util.ArrayList;
import java.util.List;

import semo.domain.Comment;
import semo.domain.Post;
import semo.service.PostSevice;
import semo.store.facade.ChoiceStore;
import semo.store.facade.PostStore;
import semo.store.logic.ChoiceStoreLogic;
import semo.store.logic.PostStoreLogic;

public class PostServiceLogic implements PostSevice{
	
	private PostStore postStore;
	private ChoiceStore choiceStore;
	
	public PostServiceLogic() {
		postStore = new PostStoreLogic();
		choiceStore = new ChoiceStoreLogic();
	}

	@Override
	public void registerComment(String postId, Comment comment) {
		postStore.insertComment(postId, comment);
	}

	@Override
	public Post searchPostByPostId(String postId) {
		Post post = postStore.selectPost(postId);
		
//		set AccuseCount
		post.setAccuseCount(postStore.selectContentByAccuse(postId).size());
		
//		set Choice
		post.setChoiceLeft(choiceStore.selectChoice(postId).get(0));
		post.setChoiceRight(choiceStore.selectChoice(postId).get(1));
		
		return post;
	}

	@Override
	public List<Post> searchByCategory(String category) {
		List<Post> posts = postStore.selectPostByCategory(category);
		List<Post> list = new ArrayList<>();
		
//		set AccuseCount
		for(Post p : posts){
			if(postStore.selectContentByAccuse(p.getId()).size() < 5){
				list.add(p);
			}
		}
		
		return list;
	}

	@Override
	public List<Post> searchByWriterId(String writerId) {
		List<Post> posts = postStore.selectPostByWriterId(writerId);
		List<Post> list = new ArrayList<>();
		
//		set AccuseCount
		for(Post p : posts){
			if(postStore.selectContentByAccuse(p.getId()).size() < 5){
				list.add(p);
			}
		}
		
		return list;
	}

	@Override
	public List<Post> searchByTitle(String title) {
		List<Post> posts = postStore.selectPostByTitle(title);
		List<Post> list = new ArrayList<>();
		
//		set AccuseCount
		for(Post p : posts){
			if(postStore.selectContentByAccuse(p.getId()).size() < 5){
				list.add(p);
			}
		}
		
		return list;
	}

	@Override
	public List<Post> searchAllPost() {
		List<Post> list = postStore.selectAllPost();
		
//		set AccuseCount
		for(Post p : list){
			if(postStore.selectContentByAccuse(p.getId()).size() < 5){
				list.add(p);
			}
		}
		
		return list;
	}

	@Override
	public void registerPost(Post post) {
		postStore.insertPost(post);
		choiceStore.insertChoice(post.getChoiceLeft(), post.getId());
		choiceStore.insertChoice(post.getChoiceRight(), post.getId());
	}

	@Override
	public void removePost(String postId) {
		postStore.deletePost(postId);
		postStore.deleteCommentByPostId(postId);
		choiceStore.deleteChoice(postId);
		postStore.deleteAccuse(postId);		
	}

	@Override
	public void modifyPost(Post post) {
		postStore.updatePost(post);
	}

	@Override
	public List<Post> searchAlaming(String userId) {
		List<String> postId = postStore.selectAlaming(userId);
		List<Post> list = new ArrayList<>();
		for(String s : postId){
			Post p = postStore.selectPost(s);
			list.add(p);
		}
		return list;
	}

	@Override
	public void registerAlaming(String userId, String postId) {
		postStore.insertAlaming(userId, postId);
	}

	@Override
	public void removeAlaming(String userId, String postId) {
		postStore.deleteAlaming(userId, postId);
	}

	@Override
	public List<Post> searchByAccuse() {
		List<Post> posts = postStore.selectAllPost();
		List<Post> list = new ArrayList<>();
		
		for(Post p : posts){
			if(postStore.selectContentByAccuse(p.getId()).size() >= 5){
				list.add(p);
			}
		}
		return list;
	}

	@Override
	public void registerAccuse(String postId, String writerId, String content) {
		postStore.registerAccuse(postId, writerId, content);
	}

	@Override
	public void removeAccuse(String postId) {
		postStore.deleteAccuse(postId);
	}

	@Override
	public List<String> searchAccuseContent(String postId) {
		return postStore.selectContentByAccuse(postId);
	}

}
