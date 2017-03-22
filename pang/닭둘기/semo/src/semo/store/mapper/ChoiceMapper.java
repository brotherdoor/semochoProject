package semo.store.mapper;

import java.util.List;
import java.util.Map;

import semo.domain.Choice;
import semo.domain.Image;

public interface ChoiceMapper {
	
	void insertChoice(Choice choice, String postId);
	
	List<Choice> selectChoice(String postId);
	List<String> selectVoteUsers(String choiceId);
	
	
	void insertVoteUser(Map<String, Integer> map);
	
	String checkVote(Map<String, String> map);

}
