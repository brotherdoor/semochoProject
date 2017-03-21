package semo.store.mapper;

import java.util.List;

import semo.domain.Good;

public interface GoodStore {
	
	void insertGood(Good good);
	void deleteGood(String goodId);
	List<Good> selectAllGood();
	List<String> selectWinners(String GoodId);
	
	void insertEnterUsers(String userId, String goodId);
	List<String> selectEnterUsers(String goodId);
	

}
