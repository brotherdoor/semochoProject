package semo.store.facade;

import java.util.List;

import semo.domain.Choice;

public interface ChoiceStore {
	
	void insertChoice(Choice choice, String postId);
	
	List<Choice> selectChoice(String postId);
	List<String> selectVoteUsers(String choiceId);
	List<String> selectPostIdbyVoteUser(String userId);
	 
	void insertVoteUser(Choice choice, String userId);
	
	String checkVote(String postId, String userId);
}
