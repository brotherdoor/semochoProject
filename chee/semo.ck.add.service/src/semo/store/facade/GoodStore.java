package semo.store.facade;

import java.util.List;

import semo.domain.Good;
import semo.domain.User;

public interface GoodStore {
	
	void insertGood(Good good);//
	void deleteGood(String goodId);//
	List<Good> selectAllGood();//
	List<String> selectWinners(String GoodId);
	
	void insertEnterUsers(String userId, String goodId);
	List<String> selectEnterUsers(String goodId);
	void insertWinners(String userId , String goodId);
	
	void deleteWinnersGood(String gooId);
	
	List<String> selectGoodIdbyUserId(String userId);//ġ����ǰ
	Good selectGoodByGoodId(String goodId); //ġ����ǰ

}
