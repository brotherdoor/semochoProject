package semo.service;

import java.util.List;

import semo.domain.Good;

public interface GoodService {
	
	List<Good> searchAllGood();
	void registerEnterUsers(String userId, String goodId);
	Good selectGoodByGoodId(String goodId);
	
}
