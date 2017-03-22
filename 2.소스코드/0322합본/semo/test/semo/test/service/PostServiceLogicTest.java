package semo.test.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import semo.domain.Choice;
import semo.domain.Comment;
import semo.domain.Image;
import semo.domain.Post;
import semo.service.logic.PostServiceLogic;

public class PostServiceLogicTest {
	
	private PostServiceLogic test;
	
	@Before
	public void setUp(){
		test = new PostServiceLogic();
	}
	

//	@Test
//	public void testRegisterComment() {
//		Comment c = new Comment();
//		c.setContent("ddd");
//		c.setWriterId("door");
//		test.registerComment("5", c);
//	}

//	@Test
//	public void testSearchPostByPostId() {
//		Post p = test.searchPostByPostId("1");
//		assertEquals(1, p.getComments().size());
//		assertEquals("무플방지위원회1", p.getComments().get(0).getContent());
//		assertEquals("간다", p.getChoiceLeft().getContent());
//		assertEquals("안간다", p.getChoiceRight().getContent());
//		assertEquals("go", p.getChoiceLeft().getImage().getImgaeName());
//	}
//
//	@Test
//	public void testSearchByCategory() {
//		List<Post> list = test.searchByCategory("피플");
//		Post p = list.get(0);
//		assertEquals(1, p.getComments().size());
//		assertEquals("무플방지위원회1", p.getComments().get(0).getContent());
//		assertEquals("간다", p.getChoiceLeft().getContent());
//		assertEquals("안간다", p.getChoiceRight().getContent());
//		assertEquals("go", p.getChoiceLeft().getImage().getImgaeName());
//	}
//
//	@Test
//	public void testSearchByWriterId() {
//		List<Post> list = test.searchByWriterId("pang");
//		Post p = list.get(0);
//		assertEquals(1, p.getComments().size());
//		assertEquals("무플방지위원회1", p.getComments().get(0).getContent());
//		assertEquals("간다", p.getChoiceLeft().getContent());
//		assertEquals("안간다", p.getChoiceRight().getContent());
//		assertEquals("go", p.getChoiceLeft().getImage().getImgaeName());
//	}
//
//	@Test
//	public void testSearchByTitle() {
//		List<Post> list = test.searchByTitle("까");
//		Post p = list.get(0);
//		assertEquals(1, p.getComments().size());
//		assertEquals("무플방지위원회1", p.getComments().get(0).getContent());
//		assertEquals("간다", p.getChoiceLeft().getContent());
//		assertEquals("안간다", p.getChoiceRight().getContent());
//		assertEquals("go", p.getChoiceLeft().getImage().getImgaeName());
//	
//	}

//	@Test
//	public void testSearchAllPost() {
//		List<Post> list = test.searchAllPost();
//		assertEquals(9, list.size());
//	
//	}

//	@Test
//	public void testRegisterPost() {
//		Post p = test.searchPostByPostId("4");
//		p.setTitle("아홉개..");
//		p.setId(null);
//		Choice cL = new Choice();
//		cL.setContent("ddd");
//		Image i = new Image();
//		i.setImageType("dd");
//		i.setImageName("dd");
//		cL.setImage(i);
//		p.setChoiceLeft(cL);
//		p.setChoiceRight(cL);
//		p.setAccuseCount(0);
//		test.registerPost(p);
		
//		for(Post p : test.searchAllPost()){
//			System.out.println(p.getId());
//		}
//		
//		assertEquals(9, test.searchAllPost().size());
//	}

//	@Test
//	public void testRemovePost() {
//		test.removePost("3");
//	}
//
//	@Test
//	public void testModifyPost() {
//		Post p = test.searchPostByPostId("3");
//		p.setTitle("admit");
//		test.modifyPost(p);
//		assertEquals("admit", test.searchByTitle("ad").get(0).getTitle());
//	}
//
//	@Test
//	public void testSearchAlaming() {
//		List<Post> list = test.searchAlaming("pang");
//		for(Post p : list){
//			System.out.println(p);
//		}
//	}
//
//	@Test
//	public void testRegisterAlaming() {
//		test.registerAlaming("door", "55");
//		assertEquals(3, test.searchAlaming("door").size());
//	}
//
//	@Test
//	public void testRemoveAlaming() {
//		test.removeAlaming("door", "55");
//	}
//
//	@Test
//	public void testSearchByAccuse() {
//		List<Post> list = test.searchByAccuse();
//		assertEquals(1, list.size());
//		assertEquals("5", list.get(0).getId());
//	}

//	@Test
//	public void testRegisterAccuse() {
//		test.registerAccuse("5", "door", "rock");
//	}

	@Test
	public void testRemoveAccuse() {
		test.removeAccuse("5");
	}

//	@Test
//	public void testSearchAccuseContent() {
//		List<String> s = test.searchAccuseContent("5");
//		for(String ss: s){
//			System.out.println(ss);
//		}
//	}

}
