package semo.store.logic;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import semo.domain.Good;
import semo.domain.User;
import semo.store.facade.GoodStore;
import semo.store.mapper.GoodMapper;
import semo.store.mapper.UserMapper;

public class GoodStoreLogic implements GoodStore{
	private SqlSessionFactory factory;
	
	public GoodStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	@Override
	public void insertGood(Good good) {//
		SqlSession session = factory.openSession();
		
		try{
			GoodMapper mapper = session.getMapper(GoodMapper.class);
			mapper.insertGood(good);
			session.commit();
		}finally{
			session.close();
		}
	}

	@Override
	public void deleteGood(String goodId) {//
		SqlSession session = factory.openSession();
		
		try{
			GoodMapper mapper = session.getMapper(GoodMapper.class);
			mapper.deleteGood(goodId);
			session.commit();
		}finally{
			session.close();
		}
	}

	@Override
	public List<Good> selectAllGood() {//
		SqlSession session = factory.openSession();
		List<Good> list = null;
		try{
			GoodMapper mapper = session.getMapper(GoodMapper.class);
			list = mapper.selectAllGood();
			session.commit();
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public List<String> selectWinners(String GoodId) {
		SqlSession session = factory.openSession();
		List<String> list = null;
		try{
			GoodMapper mapper = session.getMapper(GoodMapper.class);
			list = mapper.selectWinners(GoodId);
			
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public void insertEnterUsers(String userId, String goodId) { // 경품응모
		SqlSession session = factory.openSession();
		HashMap<String, Object> map = new HashMap<>();
		map.put("user", userId);
		map.put("good", new Integer(Integer.parseInt(goodId)));
		try{
			GoodMapper mapper = session.getMapper(GoodMapper.class);
			mapper.insertEnterUsers(map);
			session.commit();
		}finally{
			session.close();
		}
	}

	@Override
	public List<String> selectEnterUsers(String goodId) {
		SqlSession session = factory.openSession();
		List<String> list = null;
		
		try{
			GoodMapper mapper = session.getMapper(GoodMapper.class);
			list = mapper.selectEnterUsers(goodId);
			session.commit();
		}finally{
			session.close();
		}
		return list;
	}
	@Override
	public void insertWinners(String userId, String goodId) {
		
		SqlSession session = factory.openSession();
		HashMap<String, String> map = new HashMap<>();
		map.put("userId", userId);
		map.put("goodId", goodId);
		
		
		try{
			GoodMapper mapper = session.getMapper(GoodMapper.class);
			mapper.insertWinners(map);
			session.commit();
		}finally{
			session.close();
		}

		
		
		
	}
	@Override
	public void deleteWinnersGood(String gooId) {
		
		SqlSession session = factory.openSession();
		try{
			GoodMapper mapper = session.getMapper(GoodMapper.class);
			mapper.deleteWinnersGood(gooId);
			
		}finally{
			session.close();
		}
		
	}
	
	
	@Override
	public List<String> selectGoodIdbyUserId(String userId) {
		SqlSession session = factory.openSession();
		List<String> list = null;
		
		try{
			GoodMapper mapper = session.getMapper(GoodMapper.class);
			list = mapper.selectGoodIdbyUserId(userId);
			session.commit();
		}finally{
			session.close();
		}
		return list;
	}
	@Override
	public Good selectGoodByGoodId(String goodId) {
		SqlSession session = factory.openSession();
		Good good = null;
		
		try{
			GoodMapper mapper = session.getMapper(GoodMapper.class);
			good = mapper.selectGoodByGoodId(goodId);
			session.commit();
		}finally{
			session.close();
		}
		return good;
	}
}
