package semo.domain;


import java.sql.Date;
import java.util.List;

public class Post {
	
	private String id;
	private String writerId;
	private String title;
	private String category;
	private Choice choiceRight;
	private Choice choiceLeft;
	private Date endDate;
	private int accuseCount;
	
	private List<Comment> comments;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Choice getChoiceRight() {
		return choiceRight;
	}
	public void setChoiceRight(Choice choiceRight) {
		this.choiceRight = choiceRight;
	}
	public Choice getChoiceLeft() {
		return choiceLeft;
	}
	public void setChoiceLeft(Choice choiceLeft) {
		this.choiceLeft = choiceLeft;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	public int getAccuseCount() {
		return accuseCount;
	}
	public void setAccuseCount(int accuseCount) {
		this.accuseCount = accuseCount;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	
	
}
