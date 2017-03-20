package domain;

import java.sql.Date;
import java.util.List;

public class Post {
	
	String id;
	String writerId;
	String title;
	String category;
	Choice choiceRight;
	Choice choiceLeft;
	Date endDate;
	boolean accuseCondition;
	List<Comment> comments;

}
