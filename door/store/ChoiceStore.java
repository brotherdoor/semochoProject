package store;

import java.util.List;

import domain.Choice;

public interface ChoiceStore {
	
	void insertChoice(Choice choice);
	
	List<String> selectChoiceId(String postId);
	List<String> selectVoteUsers(String choiceId);
	
	Choice selectChoice(String choiceId);
	
	void insertVoteUser(Choice choice, String userId);
	
	String checkVote(String postId, String userId);
}
