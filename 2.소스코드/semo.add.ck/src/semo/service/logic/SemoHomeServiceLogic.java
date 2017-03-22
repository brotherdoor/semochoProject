package semo.service.logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import semo.domain.Good;
import semo.domain.GuestBook;
import semo.domain.Post;
import semo.domain.SemoHome;
import semo.domain.User;
import semo.service.SemoHomeService;
import semo.store.facade.ChoiceStore;
import semo.store.facade.GoodStore;
import semo.store.facade.PostStore;
import semo.store.facade.SemoHomeStore;
import semo.store.facade.UserStore;
import semo.store.logic.ChoiceStoreLogic;
import semo.store.logic.GoodStoreLogic;
import semo.store.logic.PostStoreLogic;
import semo.store.logic.SemoHomeStoreLogic;
import semo.store.logic.UserStoreLogic;

public class SemoHomeServiceLogic implements SemoHomeService {

	private SemoHomeStore store;
	private PostStore pStore;
	private UserStore uStore;
	private ChoiceStore cStore;
	private GoodStore gStore;
	
	public SemoHomeServiceLogic() {
		store = new SemoHomeStoreLogic();
		pStore = new PostStoreLogic();
		uStore = new UserStoreLogic();
		cStore = new ChoiceStoreLogic();
		gStore = new GoodStoreLogic();
	}

	@Override
	public SemoHome searchSemoHome(String userId) {
		SemoHome semoHome = new SemoHome();
		semoHome = store.selectSemoHome(userId);
		return semoHome;
	}

	@Override
	public List<Post> searchPostsByUserId(String userId) { // �Խ��� �Խù� ��������
		List<Post> list = new ArrayList<>();
		pStore.selectPostByWriterId(userId);
		return list;
	}

	@Override
	public List<Post> searchJoinsByUserId(String userId) { // ��ǥ������� ��������
		List<Post> list = new ArrayList<>();
		List<String> postIdList = cStore.selectPostIdbyVoteUser(userId);
		for(String e : postIdList){
			list.add(pStore.selectPost(e));
		}
		return list;
	}

	@Override
	public List<Good> searchGoodsByUserId(String userId) { // ��ǰ�������
		List<Good> list = new ArrayList<>();
		List<String> goodIdList = gStore.selectGoodIdbyUserId(userId);
		for(String e : goodIdList){
			list.add(gStore.selectGoodByGoodId(e));
		}
		//��ǰ�ʿ�
		return list;
	}

	@Override
	public List<User> searchFriendsByUserId(String userId) {
		List<User> list = new ArrayList<>();
		uStore.searchFriendAll(userId);
		return list;
	}

	@Override
	public List<User> searchRecommendFriendsByUserId(String userId) { // ģ����õ
		int[] number = new int[4];
		User user = uStore.searchUserById(userId);
		List<User> list = new ArrayList<>();
		List<User> sameInterest = new ArrayList<>();
		List<User> recommendList = new ArrayList<>();
		list = uStore.searchUserAll();
		
		for(User e : list){
			if(e.getInterest().equals(user.getInterest())){
				if(e.equals(user)){
					sameInterest.add(e);
				}
			}
		}
		
		if(sameInterest.size() < 5){
			recommendList = sameInterest;
		}else{
			Random random = new Random();
			for(int i=0; i < 4; i++){
			number[i] = random.nextInt(sameInterest.size()) + 1;
			recommendList.add(sameInterest.get(number[i]));
			}
			
		}
		return recommendList;
	}

	@Override
	public List<GuestBook> searchGuestBooksBySemoHomeId(String semoHomeId) {
		return store.selectGuestBook(semoHomeId);
	}

	@Override
	public void registerGuestBook(String semoHomeId ,GuestBook guestBook) {
		store.insertGuestBook(semoHomeId, guestBook);
	}

	@Override
	public void modifyGuestBook(GuestBook guestBook) {
		store.updateGuestBook(guestBook);
	}

	@Override
	public void removeGuestBook(String guestBookId) {
		store.deleteGuestBook(guestBookId);
	}


}
