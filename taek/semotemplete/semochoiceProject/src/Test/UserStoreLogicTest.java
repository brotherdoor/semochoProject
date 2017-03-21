package Test;

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
	
	
//
//	@Test
//	public void testInsertUser() {
//		
//		User user = new User();
//		user.setId("11");
//		user.setPassword("1234");
//		user.setName("����");
//		user.setBirth("911115");
//		user.setTel("01031589689");
//		user.setInterest("����");
//		user.setEmail("kimo343459@naver.com");
//		user.setGender("��");
//		user.setGrade("1");
//		user.setSemo(50);
//		
//		
//		store.insertUser(user);
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
//		assertEquals( 2, store.searchUserByName("����").size());
//		
//	}

	@Test
	public void testSelectUserById() {
		
		assertEquals("â��", store.searchUserById("33").getName());
	
	
	}
//
//	@Test
//	public void testSelectAllUser() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteUser() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdateUser() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCheckFriendById() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectAllFriend() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testInsertFriend() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteFriend() {
//		fail("Not yet implemented");
//	}

}