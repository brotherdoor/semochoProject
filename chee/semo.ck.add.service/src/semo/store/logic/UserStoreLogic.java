package semo.store.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import semo.domain.User;
import semo.store.facade.UserStore;
import semo.store.mapper.UserMapper;

public class UserStoreLogic implements UserStore {
	
	public SqlSessionFactory factory;
	
	public UserStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	@Override
	public void registerUser(User user) {
		SqlSession session = factory.openSession();
		try{
		UserMapper mapper = session.getMapper(UserMapper.class);
		mapper.registerUser(user);
		session.commit();
		}finally{
			session.close();
		}
	}
	@Override
	public int checkId(String id) {
		SqlSession session = factory.openSession();
		int check = 0;
		try{
		UserMapper mapper = session.getMapper(UserMapper.class);
		check = mapper.checkId(id);
		session.commit();
		}finally{
			session.close();
		}
		return check;
	}

	@Override
	public List<User> searchUserByName(String name) {
		SqlSession session = factory.openSession();
		
		List<User> list = null;
		
		try{
			UserMapper mapper = session.getMapper(UserMapper.class);
			list = mapper.searchUserByName(name);
		}finally{
			session.close();
		}
		return list;
	}
	@Override
	public User searchUserById(String id) {
		SqlSession session = factory.openSession();
		User user = null;
		try{
			UserMapper mapper = session.getMapper(UserMapper.class);
			user = mapper.searchUserById(id);
		}finally{
			session.close();
		}
		return user;
	}

	@Override
	public List<User> searchUserAll(){
		SqlSession session = factory.openSession();
		
		List<User> list = null;
		
		try{
			UserMapper mapper = session.getMapper(UserMapper.class);
			list = mapper.searchUserAll();
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public void removeUser(String id) {

		SqlSession session = factory.openSession();

		try{
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.removeUser(id);
			session.commit();
		}finally{
			session.close();
		}
	}

	@Override
	public void modifyUser(User user) {
		
		SqlSession session = factory.openSession();
		try{
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.modifyUser(user);
			session.commit();
		}finally{
			session.close();
		}
		
	}


	@Override
	public List<User> searchFriendAll(String userId) {
		SqlSession session = factory.openSession();
		List<User> list = null;
		System.out.println(userId);
		try{
			UserMapper mapper = session.getMapper(UserMapper.class);
			list=mapper.searchFriendAll(userId);
			System.out.println("유져스토어"+list.size());
		}finally{
			session.close();
		}
		return list;
	}

	@Override
	public int searchFriend(String userId, String friendId) {
		SqlSession session = factory.openSession();
		int check=0;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("user", userId);
		map.put("friend", friendId);
		List<String> list = null;
		
		try{
			list = session.selectList("searchFriend", map);
		}finally{
			session.close();
		}
		
		check = list.size();
		return check;
	}
	
	@Override
	public void registerFriend(String userId, String friendId) {
		SqlSession session = factory.openSession();
		int check=0;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("user", userId);
		map.put("friend", friendId);
		
		try{
			session.insert("registerFriend", map);
			session.commit();
		}finally{
			session.close();
		}
	}

	@Override
	public void removeFriend(String userId, String friendId) {
			SqlSession session = factory.openSession();
			int check=0;
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("user", userId);
			map.put("friend", friendId);
			
			try{
				session.delete("removeFriend", map);
				session.commit();
			}finally{
				session.close();
			}
		}
	
	
}
