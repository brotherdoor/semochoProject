package semo.service.logic;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import semo.domain.Choice;
import semo.domain.Comment;
import semo.domain.Post;
import semo.service.PostService;
import semo.store.facade.ChoiceStore;
import semo.store.facade.PostStore;
import semo.store.logic.ChoiceStoreLogic;
import semo.store.logic.PostStoreLogic;

public class PostServiceLogic implements PostService{
	
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
		
		for(Post p : posts){
			if(postStore.selectContentByAccuse(p.getId()).size() < 5){
//				set AccuseCount
				p.setAccuseCount(postStore.selectContentByAccuse(p.getId()).size());
				
//				set Choice
				p.setChoiceLeft(choiceStore.selectChoice(p.getId()).get(0));
				p.setChoiceRight(choiceStore.selectChoice(p.getId()).get(1));
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
//				set AccuseCount
				p.setAccuseCount(postStore.selectContentByAccuse(p.getId()).size());
				
//				set Choice
				p.setChoiceLeft(choiceStore.selectChoice(p.getId()).get(0));
				p.setChoiceRight(choiceStore.selectChoice(p.getId()).get(1));
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
//				set AccuseCount
				p.setAccuseCount(postStore.selectContentByAccuse(p.getId()).size());
				
//				set Choice
				p.setChoiceLeft(choiceStore.selectChoice(p.getId()).get(0));
				p.setChoiceRight(choiceStore.selectChoice(p.getId()).get(1));
				list.add(p);
			}
		}
		
		return list;
	}

	@Override
	public List<Post> searchAllPost() {
		List<Post> posts = postStore.selectAllPost();
		List<Post> list = new ArrayList<>();
		
//		set AccuseCount
		for(Post p : posts){
			if(postStore.selectContentByAccuse(p.getId()).size() < 5){
//				set AccuseCount
				p.setAccuseCount(postStore.selectContentByAccuse(p.getId()).size());
				
//				set Choice
				p.setChoiceLeft(choiceStore.selectChoice(p.getId()).get(0));
				p.setChoiceRight(choiceStore.selectChoice(p.getId()).get(1));
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
			if(p != null) list.add(p);
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
	public boolean registerAccuse(String postId, String writerId, String content) {
		
		if(postStore.checkAccuse(postId, writerId)){
//			신고 테이블에 추가하는거
			postStore.registerAccuse(postId, writerId, content);
			
//			게시물 테이블 accuseCount + 1 하는거
			postStore.updateAccusePostTb(postId);
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public List<Comment> searchAccuseContent(String postId) {
		return postStore.selectContentByAccuse(postId);
	}
	
	@Override
	public boolean registerVote(String postId, String choiceId, String userId) {
		if(choiceStore.checkVote(postId, userId) != null){
			return false;
		}else{
			Choice c = new Choice();
			c.setId(choiceId);
			choiceStore.insertVoteUser(c, userId);
			return true;
		}
	}

	@Override
	public void removeComment(String commentId) {
		postStore.deleteComment(commentId);
	}

}
