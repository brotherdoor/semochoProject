package semo.store.mapper;

import java.util.List;
import java.util.Map;

import semo.domain.GuestBook;
import semo.domain.SemoHome;

public interface SemoHomeMapper {
	void insertSemoHome(String userId);
	SemoHome selectSemoHome(String userId);
	void insertGuestBook(Map<String, Object> map);
	void updateGuestBook(GuestBook guestBook);
	void deleteGuestBook(String guestBookId);
	List<GuestBook> selectGuestBook(String semoHomeId);

}
