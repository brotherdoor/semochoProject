package semo.test;



import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import semo.domain.Good;
import semo.domain.Image;
import semo.store.logic.GoodStoreLogic;

public class GoodStoreLogicTest {

	private GoodStoreLogic store;
	@Before
	public void setup(){
		store = new GoodStoreLogic();
	}
	
//	@Test
//	public void testInsertGood() {
//		Good good = new Good();
//		Image image = new Image();
//		
//		Date date = new Date(2017, 10, 11);
//		good.setId("2");
//		good.setTitle("123");
//		good.setContent("28");
//		good.setProduct("12");
//		good.setStartDate(date);
//		good.setEndDate(date);
//		image.setImageType("image/jpeg");
//		image.setImgaeName("sdf");
//		good.setImage(image);
//		store.insertGood(good);
//	}

//	@Test
//	public void testDeleteGood() {
//		store.deleteGood("1");
//		assertEquals(0, store.selectAllGood().size());
//	}

//	@Test
//	public void testSelectAllGood() {
//		List<Good> list = store.selectAllGood();
//		assertEquals(6, list.size());
//	}


//	@Test
//	public void testInsertEnterUsers() {
//		store.insertEnterUsers("123", "456");
//	}

//	@Test
//	public void testSelectEnterUsers() {
//		
//		assertEquals(1, store.selectEnterUsers("1").size());
//		
//	}
	
//	@Test
//	public void testinsertWinners() {
//		
//		store.insertWinners("123", "1");
//		
//		
//	}
//	@Test
//	public void testdeleteWinnersGood() {
//		
//		store.deleteWinnersGood("1");
//	}
	
//	@Test
//	public void testSelectEnterUsers(){
//		store.selectEnterUsers("2");
//		System.out.println(store.selectEnterUsers("2"));
//	}
	
//	@Test
//	public void testselectGoodIdbyUserId(){
//		assertEquals(3, store.selectGoodIdbyUserId("pang").size());
//	}
	
//	@Test
//	public void testselectGoodByGoodId(){ // ������ �ѹ��� �޶� ���ڸ��� �׽�Ʈ�� �ٸ��� ���ü� ����
//		assertEquals("��Ʈ�� �����Ǻ�!!", store.selectGoodByGoodId("3").getTitle());
//	}
	

}