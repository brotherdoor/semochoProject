package semo.service;

import java.util.List;

import semo.domain.GuestBook;
import semo.domain.Post;
import semo.domain.SemoHome;

public interface SemoHomeService {
	
	SemoHome searchSemoHome(String userId);
	List<Post> searchPostsByUserId(String userId);
	List<Post> searchJoinsByUserId(String userId);
	List<Post> searchGoodsByUserId(String userId);
	List<Post> searchFriendsByUserId(String userId);
	List<Post> searchRecommendFriendsByUserId(String userId);
	List<Post> searchGuestBooksBySemoHomeId(String semoHomeId);
	void registerGuestBook(GuestBook guestBook);
	void modifyGuestBook(GuestBook guestBook);
	void removeGuestBook(String guestBookId);

}
