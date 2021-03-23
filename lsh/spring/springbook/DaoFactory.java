package springbook.user.dao;

import java.sql.Driver;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
public class DaoFactory {
	
	@Bean
	public UserDao userDao() {
		/*
		 * ConnectionMaker connectionMaker = new DConnectionMaker(); UserDao userDao =
		 * new UserDao(connectionMaker); return userDao;
		 */
		//return new UserDao(connectionMaker());
		
		UserDao userDao = new UserDao();
		//userDao.setConnectionMaker(connectionMaker());
		userDao.setDataSource(dataSource());
		return userDao;
	}
	
	/*
	 * public AccountDao accountDao() { return new AccountDao(connectionMaker()); }
	 * 
	 * public MessageDao messageDao() { return new MessageDao(connectionMaker()); }
	 */
	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
	
	/*
	 * @Bean public ConnectionMaker connectionMaker() { return new
	 * LocalDBConnectionMaker(); }
	 * 
	 * @Bean public ConnectionMaker connectionMaker() { return new
	 * ProductionConnectionMaker(); }
	 */
	
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		//dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
		dataSource.setDriverClass(Driver.class);
		dataSource.setUrl("jdbc:mysql://localhost/springbook");
		dataSource.setUsername("spring");
		dataSource.setPassword("book");
		
		return dataSource;
	}
}
