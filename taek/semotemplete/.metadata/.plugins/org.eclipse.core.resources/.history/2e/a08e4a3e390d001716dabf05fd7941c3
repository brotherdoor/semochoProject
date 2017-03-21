package service;

import java.util.List;

import domain.GuestBook;
import domain.Post;
import domain.SemoHome;

public interface SemoHomeService {
	
	SemoHome searchSemoHome(String userId);
	List<Post> searchPostsByUserId(String userId);
	List<Post> searchJoinsByUserId(String userId);
	List<Post> searchGoodsByUserId(String userId);
	List<Post> searchFriendsByUserId(String userId);
	List<Post> searchRecommendFriendsByUserId(String UserId);
	List<Post> searchGuestBooksBySemoHomeId(String SemoHomeId);
	void registerGuestBook(GuestBook guestBook);
	void modifyGuestBook(GuestBook guestBook);
	void removeGuestBook(String guestBookId);

}
