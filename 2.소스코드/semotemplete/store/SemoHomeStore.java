package store;

import java.util.List;

import domain.GuestBook;
import domain.SemoHome;

public interface SemoHomeStore {
	
	SemoHome selectSemoHome(String userId);
	
	void insertGuestBook(GuestBook guestBook);
	void updateGuestBook(GuestBook guestBook);
	void deleteGuestBook(String guestBookId);
	List<GuestBook> selectGuestBook(String semoHomeId);
	

}
