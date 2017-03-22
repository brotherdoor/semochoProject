package semo.store.logic;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import semo.domain.Choice;
import semo.store.facade.ChoiceStore;
import semo.store.mapper.ChoiceMapper;

public class ChoiceStoreLogic implements ChoiceStore{
	
	private SqlSessionFactory factory;
	
	public ChoiceStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	

	@Override
	public void insertChoice(Choice choice, String postId) {
		SqlSession session = factory.openSession();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("choice", choice);
		map.put("postId", postId);
		
		try{
			session.insert("insertChoice", map);
			session.commit();
			
		}finally{
			session.close();
		}
		
	}

	@Override
	public void deleteChoice(String postId) {
		SqlSession session = factory.openSession();
		try{
			ChoiceMapper mapper = session.getMapper(ChoiceMapper.class);
			mapper.deleteChoice(Integer.parseInt(postId));
			session.commit();
		}finally{
			session.close();
		}
	}
	
	@Override
	public List<Choice> selectChoice(String postId) {
		SqlSession session = factory.openSession();
		List<Choice> list = null;
		
		try{
			ChoiceMapper mapper = session.getMapper(ChoiceMapper.class);
			list = mapper.selectChoice(postId);
		}finally{
			session.close();
		}
		
		return list;
	}

	@Override
	public List<String> selectVoteUsers(String choiceId) {
		SqlSession session = factory.openSession();
		List<String> list =null;
		
		try{
			ChoiceMapper mapper = session.getMapper(ChoiceMapper.class);
			list = mapper.selectVoteUsers(choiceId);
		}finally{
			session.close();
		}
		return list;
	}


	@Override
	public void insertVoteUser(Choice choice, String userId) {
		SqlSession session = factory.openSession();
		HashMap<String, Integer> map = new HashMap<>();
		map.put("choiceId", Integer.parseInt(choice.getId()));
		map.put("userId", Integer.parseInt(userId));
		try{
			ChoiceMapper mapper = session.getMapper(ChoiceMapper.class);
			mapper.insertVoteUser(map);
			session.commit();
		}finally{
			session.close();
		}
		
	}

	@Override
	public String checkVote(String postId, String userId) {
		String check=null;
		
		SqlSession session = factory.openSession();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("postId", postId );
		map.put("userId", userId);
		try{
			ChoiceMapper mapper = session.getMapper(ChoiceMapper.class);
			check = mapper.checkVote(map);
		}finally{
			session.close();
		}
		
		
		return check;
		
	}


	@Override
	public List<String> selectPostIdbyVoteUser(String userId) { // ġ�� ��ǰ ������ �� ����
		SqlSession session = factory.openSession();
		List<String> list =null;
		
		try{
			ChoiceMapper mapper = session.getMapper(ChoiceMapper.class);
			list = mapper.selectPostIdbyVoteUser(userId);
		}finally{
			session.close();
		}
		return list;
	}

}
