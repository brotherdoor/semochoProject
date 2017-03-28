package semo.service;

import java.util.List;

import semo.domain.Good;
import semo.domain.GuestBook;
import semo.domain.Post;
import semo.domain.SemoHome;
import semo.domain.User;

public interface SemoHomeService {
	
	
	void createSemoHome(String userId);
	SemoHome searchSemoHome(String userId);
	List<Post> searchPostsByUserId(String userId);
	List<Post> searchJoinsByUserId(String userId);
	List<Good> searchGoodsByUserId(String userId);
	List<User> searchFriendsByUserId(String userId);
	List<User> searchRecommendFriendsByUserId(String userId);
	List<GuestBook> searchGuestBooksBySemoHomeId(String semoHomeId);
	void modifyGuestBook(GuestBook guestBook);
	void removeGuestBook(String guestBookId);
	void registerGuestBook(String semoHomeId, GuestBook guestBook);

}
