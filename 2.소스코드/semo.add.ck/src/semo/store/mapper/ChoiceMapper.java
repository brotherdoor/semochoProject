package semo.store.mapper;

import java.util.List;
import java.util.Map;

import semo.domain.Choice;
import semo.domain.Image;

public interface ChoiceMapper {
	
	void insertChoice(Choice choice, String postId);
	
	List<Choice> selectChoice(String postId);
	List<String> selectVoteUsers(String choiceId);
	List<String> selectPostIdbyVoteUser(String userId);
	
<<<<<<< HEAD
=======
	void deleteChoice(int postId);
	
>>>>>>> refs/heads/door2
	void insertVoteUser(Map<String, Integer> map);
	
	String checkVote(Map<String, String> map);

}
