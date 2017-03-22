package semo.domain;
import java.util.List;

public class SemoHome {
	
	private String id;
	private User user;
	private List<Post> posts;
	private List<GuestBook> guestBooks;
	private List<Post> joins;
	private List<Good> goods;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public List<GuestBook> getGuestBooks() {
		return guestBooks;
	}
	public void setGuestBooks(List<GuestBook> guestBooks) {
		this.guestBooks = guestBooks;
	}
	public List<Post> getJoins() {
		return joins;
	}
	public void setJoins(List<Post> joins) {
		this.joins = joins;
	}
	public List<Good> getGoods() {
		return goods;
	}
	public void setGoods(List<Good> goods) {
		this.goods = goods;
	}
	
	

}
