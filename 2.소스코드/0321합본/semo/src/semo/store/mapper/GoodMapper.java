package semo.store.mapper;

import java.util.List;
import java.util.Map;

import semo.domain.Good;
import semo.domain.User;

public interface GoodMapper {
	void insertGood(Good good);
	void deleteGood(String goodId);
	List<Good> selectAllGood();
	void insertEnterUsers(Map<String, Object> map);
	List<String> selectEnterUsers(String goodId);
	List<String> selectWinners(String GoodId);
	
	void insertWinners(Map<String, String> map);
	void deleteWinnersGood(String gooId);
	
}
