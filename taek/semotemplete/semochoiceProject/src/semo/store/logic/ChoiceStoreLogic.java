package semo.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import semo.domain.Choice;
import semo.domain.User;
import semo.store.facade.ChoiceStore;
import semo.store.mapper.UserMapper;

public class ChoiceStoreLogic implements ChoiceStore{
	
	public SqlSessionFactory factory;
	
	public ChoiceStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}
	
	
	

	@Override
	public void insertChoice(Choice choice) {
		
		
	}

	@Override
	public List<String> selectChoiceId(String postId) {
		return null;
	}

	@Override
	public List<String> selectVoteUsers(String choiceId) {
		return null;
	}

	@Override
	public Choice selectChoice(String choiceId) {
		return null;
	}

	@Override
	public void insertVoteUser(Choice choice, String userId) {
		
	}

	@Override
	public String checkVote(String postId, String userId) {
		return null;
	}

}
