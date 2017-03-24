package semo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import semo.domain.User;
import semo.store.logic.UserStoreLogic;

public class UserStoreLogicTest {
	
	private UserStoreLogic store;
	
	@Before
	public void setup(){
		store = new UserStoreLogic();
	}
	
	
	
//	@Test
//	public void testInsertUser() {
//		
//		User user = new User();
//		user.setId("last");
//		user.setPassword("123456");
//		user.setName("��Ʈ");
//		user.setBirth("1991/11/21");
//		user.setTel("01084894898");
//		user.setInterest("����");
//		user.setEmail("lch3427@naver.com");
//		user.setGender("��");
//		user.setGrade("��");
//		user.setSemo(500000	);
//		
//		
//		store.registerUser(user);
//	}

//	@Test
//	public void testCheckId() {
//		
//		
//		assertEquals(11,store.checkId("11"));
//		
//	}

//	@Test
//	public void testSelectUserByName() {
//		
//		assertEquals( 1, store.searchUserByName("������").size());
//		
//	}

//	@Test
//	public void testSelectUserById() {
//		
//		assertEquals("��â��", store.searchUserById("pang").getName());
//	
//	}
//
//	@Test
//	public void testSelectAllUser() {
//		
//
//		assertEquals(1, store.searchUserAll().size());
//	
//	}

//	@Test
//	public void testDeleteUser() {
//		
//		store.removeUser("11");
//
//		assertEquals(1, store.searchUserAll().size());
//	
//	}
//
//	@Test
//	public void testUpdateUser() {
//
//		
//		User user = store.searchUserById("last");
//	
//		user.setSemo(50);
//	
//		store.modifyUser(user);
//		assertEquals("123456", store.searchUserById("last").getPassword());
//	}


//	@Test
//	public void testSelectAllFriend() {
//		
//		assertEquals(1, store.searchFriendAll("11").size());
//	}
//
	
//	@Test
//	public void testSearchFriend() {
//		assertEquals(1, store.searchFriend("11", "33"));
//	}
	
//	@Test
//	public void testInsertFriend() {
//		
//		store.registerFriend("11", "33");
//		assertEquals(1, store.searchFriend("11", "33"));
//	}

//	@Test
//	public void testDeleteFriend() {
//		
//		store.removeFriend("11", "33");
//		assertEquals(0, store.searchFriend("11", "33"));
//		
//	}

}
