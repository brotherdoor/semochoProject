package semo.service.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import semo.domain.Comment;
import semo.domain.Good;
import semo.domain.Post;
import semo.domain.User;
import semo.service.AdminService;
import semo.service.GoodService;
import semo.store.logic.ChoiceStoreLogic;
import semo.store.logic.GoodStoreLogic;
import semo.store.logic.PostStoreLogic;
import semo.store.logic.UserStoreLogic;

public class AdminServiceLogic implements AdminService{
	
	private GoodStoreLogic goodStore;
	private UserStoreLogic userStore;
	private PostStoreLogic postStore;
	private ChoiceStoreLogic choiceStore;
	
	
	public AdminServiceLogic() {
		
		goodStore = new GoodStoreLogic();
		userStore = new UserStoreLogic();
		postStore = new PostStoreLogic();
		choiceStore = new ChoiceStoreLogic();
		
		
	}
	

	@Override
	public List<Post> findAccuseAll() {
		
		List<Post> list = new ArrayList<>();
		List<Post> accuses= new ArrayList<>();
		
		
		//모든 게시물을 가져온다
		list = postStore.selectAllPost();
		
		for(Post p : list){
			//신고물 개수를 검사해서 리스트에 담는다.
			if(p.getAccuseCount()>5){
				p.setComments(postStore.selectContentByAccuse(p.getId()));		
				accuses.add(p);
				}
		}
		return accuses;
	}

	

	@Override
	public void accuseReset(String postId) {
		postStore.deleteAccuse(postId);
	}

	@Override
	public void removePost(String postId) {
		//해당 포스트 관련 삭제
		postStore.deleteAccuse(postId);
		postStore.deleteCommentByPostId(postId);
		postStore.deletePost(postId);
	}

	@Override
	public void regiserGood(Good good) {
		goodStore.insertGood(good);
		
	}

	@Override
	public void removeGood(String goodId) {
		goodStore.deleteGood(goodId);
	}

	@Override
	public List<User> registerWinners(int items, String goodId) {
		Random random = new Random();
		List<User> list =new ArrayList<>();
		List<String> enter = null;
		enter = goodStore.selectEnterUsers(goodId);
		
		for(int i=0; i<items; i++){
		//불러온 응모자 userId 리스트에서 random 번째 유저아이디로 사용자정보를 찾아 당첨자 리스트에 추가한다.
		int ran = random.nextInt(enter.size());
		list.add(userStore.searchUserById(enter.get(ran)));
		//당첨자는 응모자 리스트에서 제거
		enter.remove(ran);
		}
		
		for(User u :list){
			goodStore.insertWinners(u.getId(), goodId);
		}
		
		
		return list;
	}

	@Override
	public User findUserById(String userId) {
		return userStore.searchUserById(userId);
	}
	
	@Override
	public List<User> findUserByName(String name) {
		return userStore.searchUserByName(name);
	}
	

	@Override
	public void removeUser(String userId) {
		userStore.removeUser(userId);
	}


	
	
	
	

}
