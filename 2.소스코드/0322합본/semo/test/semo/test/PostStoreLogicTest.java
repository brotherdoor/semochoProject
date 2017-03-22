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
//		assertEquals(1, list.size());
//		assertEquals("pang", list.get(0).getWriterId());
//	}

//	@Test
//	public void testInsertComment() {
//		Comment c = new Comment();
//		c.setContent("111");
//		c.setWriterId("111");
//		test.insertComment("6", c);
//		assertEquals(2, test.selectComments("6").size());
//	}
//
//	@Test
//	public void testDeleteComment() {
//		test.deleteComment("7");
//		assertEquals(1, test.selectComments("6").size());
//	}

//	@Test
//	public void testDeleteCommentByPostId() {
//		test.deleteCommentByPostId("6");
//		assertEquals(0, test.selectComments("6").size());
//	}
//
//	@Test
//	public void testSelectPostByCategory() {
//		List<Post> list = test.selectPostByCategory("연예");
//		assertEquals(1, list.size());
//		assertEquals("hehe", list.get(0).getWriterId());
//	}
//
//	@Test
//	public void testSelectPostByWriterId() {
//		List<Post> list = test.selectPostByWriterId("door");
//		assertEquals(1, list.size());
//		assertEquals("이거 무슨 색으로 보여요?", list.get(0).getTitle());
//	}
//
//	@Test
//	public void testSelectPostByTitle() {
//		List<Post> list = test.selectPostByTitle("소");
//		assertEquals(1, list.size());
//	}
//
//	@Test
//	public void testSelectPost() {
//		Post post = test.selectPost("1");
//		assertEquals("pang", post.getWriterId());
//	}
//
//	@Test
//	public void testSelectAllPost() {
//		List<Post> list = test.selectAllPost();
//		assertEquals(5, list.size());
//	}
//
//	@Test
//	public void testInsertPost() {
//		Post p = new Post();
//		Date d = new Date(2017, 11, 19);
//		p.setCategory("1");
//		p.setEndDate(d);
//		p.setTitle("abc");
//		p.setWriterId("door");
//		test.insertPost(p);
//		assertEquals(6, test.selectAllPost().size());
//	}
//
//	@Test
//	public void testUpdatePost() {
//		Post p = new Post();
//		Date d = new Date(2017, 11, 19);
//		p.setId("6");
//		p.setCategory("upup");
//		p.setEndDate(d);
//		p.setTitle("update");
//		p.setWriterId("door");
//		test.updatePost(p);
//		assertEquals(2, test.selectPostByTitle("up").size());
//		assertEquals("upup", test.selectPostByTitle("up").get(0).getCategory());
//	}
//
//	@Test
//	public void testDeletePost() {
//		test.deletePost("6");
//		assertEquals(5, test.selectAllPost().size());
//	}
//
//	@Test
//	public void testSelectAlaming() {
//		List<String> list = test.selectAlaming("pang");
//		assertEquals(4, list.size());
//	}
//
//	@Test
//	public void testInsertAlaming() {
//		test.insertAlaming("door", "2");
//		assertEquals(2, test.selectAlaming("door").size());
//	}
//
//	@Test
//	public void testDeleteAlaming() {
//		test.deleteAlaming("pang", "2");
//		assertEquals(3, test.selectAlaming("pang").size());
//	}
//
//	@Test
//	public void testSelectContentByAccuse() {
//		List<String> list = test.selectContentByAccuse("4");
//		assertEquals(4, list.size());
//	}
//
//	@Test
//	public void testCheckAccuse() {
//		assertEquals("음란해요", test.checkAccuse("1", "hehe"));
//	}
//
//	@Test
//	public void testRegisterAcuuse() {
//		test.registerAccuse("1", "door", "나니");
//		assertEquals(false, test.checkAccuse("1", "door"));
//		
//	}
//
//	@Test
//	public void testDeleteAccuse() {
//		test.deleteAccuse("1");
//		assertEquals(true, test.checkAccuse("1", "door"));
//	}
//
	@Test
	public void testUpdateAccuseTb() {
		test.updateAccusePostTb("1");
		
	}

}
