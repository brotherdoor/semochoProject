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
//		user.setId("33");
//		user.setPassword("1234");
//		user.setName("택");
//		user.setBirth("911115");
//		user.setTel("01031589689");
//		user.setInterest("연예");
//		user.setEmail("kimo343459@naver.com");
//		user.setGender("남");
//		user.setGrade("1");
//		user.setSemo(50);
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
//		assertEquals( 1, store.searchUserByName("택진").size());
//		
//	}

//	@Test
//	public void testSelectUserById() {
//		
//		assertEquals("택진", store.searchUserById("11").getName());
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

	@Test
	public void testDeleteUser() {
		
		store.removeUser("11");

		assertEquals(1, store.searchUserAll().size());
	
	}
//
//	@Test
//	public void testUpdateUser() {
//
//	
//		User user = new User();
//		user.setId("11");
//		user.setPassword("1111");
//		user.setName("택진");
//		user.setBirth("911115");
//		user.setTel("01031589689");
//		user.setInterest("연예");
//		user.setEmail("kimo343459@naver.com");
//		user.setGender("남");
//		user.setGrade("1");
//		user.setSemo(50);
//	
//		store.modifyUser(user);
//		assertEquals("1111", store.searchUserById("11").getPassword());
//	}
//
//
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
