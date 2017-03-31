package semo.service;

import java.util.List;

import semo.domain.Good;
import semo.domain.User;

public interface GoodService {
	
	void registerGood(Good good);
	void removeGood(String goodId);
	List<Good> searchAllGood();
	List<User> searchWinners(String goodId);
	void registerEnterUsers(String userId, String goodId);
	List<Good> searchEnterUsers(String goodId);

}
