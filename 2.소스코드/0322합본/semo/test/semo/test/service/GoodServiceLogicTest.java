package semo.test.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import semo.service.GoodService;
import semo.service.logic.GoodServiceLogic;

public class GoodServiceLogicTest {
	private GoodService service;
	
	@Before
	public void setUp(){
		service = new GoodServiceLogic();
	}

//	@Test
//	public void testSearchAllGood() { // �Ϸ�
//		assertEquals(8, service.searchAllGood().size());
//	}

//	@Test
//	public void testRegisterEnterUsers() { // �Ϸ�
//		service.registerEnterUsers("345", "123");
//	}

}
