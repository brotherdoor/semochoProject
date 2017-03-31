package semo.store.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import semo.domain.GuestBook;
import semo.domain.SemoHome;
import semo.store.facade.SemoHomeStore;
import semo.store.mapper.SemoHomeMapper;

public class SemoHomeStoreLogic implements SemoHomeStore {
	
	private SqlSessionFactory factory;
	
	public SemoHomeStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public SemoHome selectSemoHome(String userId) {
		SqlSession session = factory.openSession();
		
		SemoHome semoHome = null;
		
		try{
			SemoHomeMapper mapper = session.getMapper(SemoHomeMapper.class);
			semoHome = mapper.selectSemoHome(userId);
			
		}finally{
			session.close();
		}
		return semoHome;
	}

	@Override
	public void insertGuestBook(String semoHomeId, GuestBook guestBook) {
		SqlSession session = factory.openSession();
		
		Map<String, Object> map = new HashMap<>();
		map.put("semoHomeId", semoHomeId);
		map.put("guestBook", guestBook);
		
		try{
			SemoHomeMapper mapper = session.getMapper(SemoHomeMapper.class);
			mapper.insertGuestBook(map);
			session.commit();
		}finally{
			session.close();
		}
		
	}

	@Override
	public void updateGuestBook(GuestBook guestBook) {
		SqlSession session = factory.openSession();
		try{
			SemoHomeMapper mapper =session.getMapper(SemoHomeMapper.class);
			mapper.updateGuestBook(guestBook);
			session.commit();
		}finally{
			session.close();
		}
		
	}

	@Override
	public void deleteGuestBook(String guestBookId) {
		SqlSession session = factory.openSession();
		try{
			SemoHomeMapper mapper =session.getMapper(SemoHomeMapper.class);
			mapper.deleteGuestBook(guestBookId);
			session.commit();
		}finally{
			session.close();
		}
		
	}

	@Override
	public List<GuestBook> selectGuestBook(String semoHomeId) {
		SqlSession session = factory.openSession();
		List<GuestBook> list = null;
		try{
			SemoHomeMapper mapper = session.getMapper(SemoHomeMapper .class);
			list = mapper.selectGuestBook(semoHomeId);
			
		}finally{
			session.close();
		}
		return list;
	}

}
