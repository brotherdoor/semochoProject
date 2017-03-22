package semo.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import semo.domain.Comment;
import semo.domain.Post;
import semo.store.logic.PostStoreLogic;

public class PostStoreLogicTest {
	
	private PostStoreLogic test;
	
	@Before
	public void setUp(){
		test = new PostStoreLogic();
	}

//	@Test
//	public void testSelectComments() {
//		List<Comment> list = test.selectComments("1");
//		System.out.println(list.get(1).getContent());
//		assertEquals(2, list.size());
//	}

//	@Test
//	public void testInsertComment() {
//		Comment c = new Comment();
//		c.setContent("444");
//		c.setWriterId("444");
//		test.insertComment("1", c);
//		assertEquals(4, test.selectComments("1").size());
//	}
//
//	@Test
//	public void testDeleteComment() {
//		test.deleteComment("23");
//		assertEquals(3, test.selectComments("1").size());
//	}

//	@Test
//	public void testDeleteCommentByPostId() {
//		test.deleteCommentByPostId("1");
//		assertEquals(0, test.selectComments("1").size());
//	}
//
//	@Test
//	public void testSelectPostByCategory() {
//		List<Post> list = test.selectPostByCategory("1");
//		assertEquals(2, list.size());
//		assertEquals(1, list.get(0).getComments().size());
//	}
//
//	@Test
//	public void testSelectPostByWriterId() {
//		List<Post> list = test.selectPostByWriterId("12");
//		assertEquals(1, list.size());
//		assertEquals("11", list.get(0).getId());
//	}
//
//	@Test
//	public void testSelectPostByTitle() {
//		List<Post> list = test.selectPostByTitle("a");
//		assertEquals(1, list.size());
//	}
//
//	@Test
//	public void testSelectPost() {
//		Post post = test.selectPost("1");
//		assertEquals(true, post.isAccuseCondition());
//	}
//
	@Test
	public void testSelectAllPost() {
		List<Post> list = test.selectAllPost();
		assertEquals(2, list.size());
		System.out.println(list.get(1).getWriterId());
	}
//
//	@Test
//	public void testInsertPost() {
//		Post p = new Post();
//		Date d = new Date(2017, 11, 19);
//		p.setCategory("1");
//		p.setEndDate(d);
//		p.setTitle("abc");
//		p.setWriterId("12");
//		test.insertPost(p);
//		assertEquals(3, test.selectAllPost().size());
//	}
//
//	@Test
//	public void testUpdatePost() {
//		Post p = new Post();
//		Date d = new Date(2017, 11, 19);
//		p.setId("2");
//		p.setCategory("upup");
//		p.setEndDate(d);
//		p.setTitle("update");
//		p.setWriterId("12");
//		test.updatePost(p);
//		assertEquals(1, test.selectPostByTitle("up").size());
//		assertEquals("upup", test.selectPostByTitle("up").get(0).getCategory());
//	}
//
//	@Test
//	public void testDeletePost() {
//		test.deletePost("11");
//		assertEquals(2, test.selectAllPost().size());
//	}
//
//	@Test
//	public void testSelectAlaming() {
//		List<String> list = test.selectAlaming("1");
//		assertEquals(1, list.size());
//		assertEquals("1", list.get(0));
//	}
//
//	@Test
//	public void testInsertAlaming() {
//		test.insertAlaming("2", "2");
//		assertEquals(1, test.selectAlaming("2").size());
//	}
//
//	@Test
//	public void testDeleteAlaming() {
//		test.deleteAlaming("1", "1");
//		assertEquals(0, test.selectAlaming("1").size());
//		assertEquals(1, test.selectAlaming("2").size());
//	}
//
//	@Test
//	public void testSelectContentByAccuse() {
//		List<String> list = test.selectContentByAccuse("1");
//		assertEquals(2, list.size());
//		System.out.println(list.get(0));
//	}
//
//	@Test
//	public void testCheckAccuse() {
//		assertEquals(true, test.checkAccuse("11", "11"));
//		assertEquals(false, test.checkAccuse("1", "1"));
//	}
//
//	@Test
//	public void testRegisterAcuuse() {
//		test.registerAccuse("3", "3", "3");
//		assertEquals(false, test.checkAccuse("3", "3"));
//		
//	}
//
//	@Test
//	public void testDeleteAccuse() {
//		test.deleteAccuse("3");
//		assertEquals(true, test.checkAccuse("3", "3"));
//	}
//
//	@Test
//	public void testUpdateAccuseTb() {
//		test.updateAccusePostTb("2");
//		
//	}

}
