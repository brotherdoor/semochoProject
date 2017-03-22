package semo.store.logic;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

<<<<<<< HEAD
=======


>>>>>>> refs/heads/door2
public class SqlSessionFactoryProvider {
	private static final String resource = "semo/store/config.xml";
	
	private static SqlSessionFactory factory;
	
	public static SqlSessionFactory getSqlSessionFactory(){
		if(factory == null){
			creatSqlSessionFactory();
		}
		return factory;
	}
	
	private static void creatSqlSessionFactory(){
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
