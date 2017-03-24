package semo.store.mapper;

import java.util.List;
import java.util.Map;

import semo.domain.Choice;
import semo.domain.Image;

public interface ChoiceMapper {
	
	void insertChoice(Map<String, Object> map);
	
	List<Choice> selectChoice(String postId);
	List<String> selectVoteUsers(String choiceId);
	List<String> selectPostIdbyVoteUser(String userId);
	

	void deleteChoice(int postId);
	
	void insertVoteUser(Map<String, Integer> map);
	
	String checkVote(Map<String, String> map);

}
