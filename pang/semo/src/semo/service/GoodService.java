package semo.service;

import java.util.List;

import semo.domain.Good;
import semo.domain.User;

public interface GoodService {
	
	List<Good> searchAllGood();
	void registerEnterUsers(String userId, String goodId);


}
