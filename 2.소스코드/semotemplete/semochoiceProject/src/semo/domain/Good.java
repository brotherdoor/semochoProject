package semo.domain;

import java.sql.Date;
import java.util.List;

public class Good {
	
	private String id;
	private String title;
	private String content;
	private String product;
	private Date startDate;
	private Date endDate;
	private Image image;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public int getUseSemo() {
		return useSemo;
	}
	public void setUseSemo(int useSemo) {
		this.useSemo = useSemo;
	}
	public List<String> getEnterUsers() {
		return enterUsers;
	}
	public void setEnterUsers(List<String> enterUsers) {
		this.enterUsers = enterUsers;
	}
	public List<String> getWinners() {
		return winners;
	}
	public void setWinners(List<String> winners) {
		this.winners = winners;
	}
	private int useSemo;
	private List<String> enterUsers;
	private List<String> winners;

}
