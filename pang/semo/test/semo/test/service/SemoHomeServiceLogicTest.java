package semo.test.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import semo.domain.Good;
import semo.domain.GuestBook;
import semo.domain.Post;
import semo.domain.SemoHome;
import semo.domain.User;
import semo.service.SemoHomeService;
import semo.service.logic.SemoHomeServiceLogic;
import semo.store.facade.SemoHomeStore;
import semo.store.logic.SemoHomeStoreLogic;

public class SemoHomeServiceLogicTest {
	
	private SemoHomeService service;
	
	@Before
	public void setUp(){
		service = new SemoHomeServiceLogic();
	}

	@Test
	public void testSearchSemoHome() {
		SemoHome sh = new SemoHome();
		sh = service.searchSemoHome("chee");
		
		assertEquals("2", sh.getId());
		assertEquals("인치광", sh.getUser().getName());
		assertEquals(1, sh.getGuestBooks().size());
		assertEquals(1, sh.getGoods().size());
		assertEquals(1, sh.getPosts().size());
		assertEquals(4, sh.getJoins().size());
		
	}
//
//	@Test
//	public void testSearchPostsByUserId() {
//		List<Post> list = new ArrayList<>();
//		list = service.searchPostsByUserId("chee");
//		assertEquals(1, list.size());
//	}

//	@Test
//	public void testSearchJoinsByUserId() {
//		List<Post> list = new ArrayList<>();
//		list = service.searchJoinsByUserId("chee");
//		assertEquals(4, list.size());
//	}

//	@Test
//	public void testSearchGoodsByUserId() {
//		List<Good> list = new ArrayList<>();
//		list = service.searchGoodsByUserId("chee");
//		assertEquals(1, list.size());
//	}

	
//	@Test
//	public void testSearchFriendsByUserId() {
//		List<User> list = new ArrayList<>();
//		list = service.searchFriendsByUserId("chee");
//		assertEquals(4, list.size());
//	}
		

//	@Test
//	public void testSearchRecommendFriendsByUserId() {
//		List<User> list = new ArrayList<>();
//		list  = service.searchRecommendFriendsByUserId("chee");
//		assertEquals(3, list.size());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(1).getName());
//		System.out.println(list.get(2).getName());
//		
//	}
	

//	@Test
//	public void testSearchGuestBooksBySemoHomeId() {
//		List<GuestBook> list = new ArrayList<>();
//		list = service.searchGuestBooksBySemoHomeId("4");
//		
//		assertEquals(2, list.size());
//	}

//	@Test
//	public void testRegisterGuestBook() {
//		GuestBook gb = new GuestBook();
//		gb.setContent("서비스단위테스트");
//		gb.setWriterId("chee");
//		
//		service.registerGuestBook("5", gb);
//		
//	}

//	@Test
//	public void testModifyGuestBook() {
//		GuestBook gb = new GuestBook();
//		gb.setContent("서비스단위테스트했다가 수정");
//		gb.setWriterId("chee");
//		gb.setId("9");
//		service.modifyGuestBook(gb);
//	}
//
//	@Test
//	public void testRemoveGuestBook() {
//		service.removeGuestBook("9");
//	}

}
