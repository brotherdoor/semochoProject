package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import semo.domain.GuestBook;
import semo.domain.SemoHome;
import semo.domain.User;
import semo.store.facade.SemoHomeStore;
import semo.store.logic.SemoHomeStoreLogic;

public class SemoHomeStoreLogicTest {
	
	private SemoHomeStore store;
	
	@Before
	public void setUp(){
		store = new SemoHomeStoreLogic();
	}

//	@Test
//	public void testSelectSemoHome() {
//		
//		SemoHome sh = new SemoHome();
//		sh = store.selectSemoHome("chee0806");
//		
//		assertEquals(2, sh.getId());
//		
//	}

//	@Test
//	public void testInsertGuestBook() {
//		
//		GuestBook gb = new GuestBook();
//		
//		gb.setContent("내용들어가나");
//		gb.setWriterId("chm");
//		
//		store.insertGuestBook("2", gb);
//		
//	}

//	@Test
//	public void testUpdateGuestBook() {
//		
//		GuestBook gb = new GuestBook();
//		
//		
//		gb.setContent("내용이바뀌나");
//		gb.setWriterId("chee0806");
//		gb.setId("1");
//		
//		store.updateGuestBook(gb);	
//	}

//	@Test
//	public void testDeleteGuestBook() {
//		store.deleteGuestBook("1");
//		List<GuestBook> list = store.selectGuestBook("chee0806");
//		assertEquals(0, list.size());
//	}

	@Test
	public void testSelectGuestBook() {
		List<GuestBook> list = store.selectGuestBook("1");
		assertEquals(1, list.size());
	
	}

}
