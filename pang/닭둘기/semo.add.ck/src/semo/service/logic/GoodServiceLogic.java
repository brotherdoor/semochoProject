package semo.service.logic;

import java.util.List;

import semo.domain.Good;
import semo.service.GoodService;
import semo.store.facade.GoodStore;
import semo.store.logic.GoodStoreLogic;

public class GoodServiceLogic implements GoodService{
	
	private GoodStore gStore;
	
	public GoodServiceLogic() {
		gStore = new GoodStoreLogic();
	}

	@Override
	public List<Good> searchAllGood() {
		List<Good> list = gStore.selectAllGood();
		return list;
	}

	@Override
	public void registerEnterUsers(String userId, String goodId) {
		gStore.insertEnterUsers(userId, goodId);
	}

}
