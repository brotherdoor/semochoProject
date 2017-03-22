package semo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import semo.domain.Choice;
import semo.domain.Image;
import semo.store.logic.ChoiceStoreLogic;

public class ChoiceStoreLogicTest {
	
	private ChoiceStoreLogic store;
	
	@Before
	public void setUp(){
		store = new  ChoiceStoreLogic();
	}
	
	

//	@Test
//	public void testInsertChoice() {
//		
//		Choice choice = new Choice();
//		Image image = new Image();
//		
//		image.setImageType("jpg");
//		image.setImgaeName("test");
//		
//		choice.setContent("æ»≥Á«œººø‰");
//		choice.setImage(image);
//				
//		
//
//		store.insertChoice(choice, "1");
//	
//	}
//
//	@Test
//	public void testSelectChoice() {
//		
//		
//		assertEquals(1, store.selectChoice("1").size());
//
//		
//	
//	}
//
//	@Test
//	public void testSelectVoteUsers() {
//		
//		assertEquals(1, store.selectVoteUsers("1").size());
//		
//	}
//
//	@Test
//	public void testInsertVoteUser() {
//		
//		Choice choice = store.selectChoice("1").get(0);
//		
//		store.insertVoteUser(choice, "22");
//		assertEquals(1, store.selectVoteUsers("1").size());
//	}
//
//	@Test
//	public void testCheckVote() {
//		
//		
//		assertEquals("1", store.checkVote("1", "33"));
//	}
	
	@Test
	public void testDeleteChoice(){
		store.deleteChoice("1");

	}

}
