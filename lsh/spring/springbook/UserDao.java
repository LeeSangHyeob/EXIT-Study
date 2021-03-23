package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springbook.user.domain.User;

public class UserDao {
	
	//private SimpleConnectionMaker simpleConnectionMaker;
	private ConnectionMaker connectionMaker;
	private Connection c;
	private User user;
	
	private static UserDao INSTANCE;
	
	private DataSource dataSource;
	
	/*
	 * public UserDao() { //simpleConnectionMaker = new SimpleConnectionMaker();
	 * //connectionMaker = new DConnectionMaker(); }
	 */
	 
	/*
	 * public UserDao(ConnectionMaker connectionMaker) { this.connectionMaker =
	 * connectionMaker; }
	 */
	
	/*
	 * private UserDao(ConnectionMaker connectionMaker) { this.connectionMaker =
	 * connectionMaker; }
	 */
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public UserDao(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}
	
	public void setConnectionMaker(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}
	
	public static synchronized UserDao getInstance() {
		if(INSTANCE == null) INSTANCE = new UserDao();
		return INSTANCE;
	}
	
	/*
	 * public UserDao() { DaoFactory daoFactory = new DaoFactory();
	 * this.connectionMaker = daoFactory.connectionMaker(); }
	 */
	
	public UserDao() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		this.connectionMaker = context.getBean("connectionMaker", ConnectionMaker.class);
	}
	
	public void add(User user) throws ClassNotFoundException, SQLException {
		/*
		 * Class.forName("com.mysql.jdbc.Driver"); Connection c =
		 * DriverManager.getConnection("jdbc:mysql://localhost/springbook","spring",
		 * "book");
		 */
		//Connection c = getConnection();
		//Connection c = simpleConnectionMaker.getConnection();
		//this.c = connectionMaker.makeConnection();
		
		Connection c = dataSource.getConnection();
		PreparedStatement ps = c.prepareStatement("INSERT INTO USERS (id, name, password) VALUES (?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		
		ps.executeUpdate();
		
		ps.close();
		c.close();
	}
	
	public User get(String id) throws ClassNotFoundException, SQLException {
		/*
		 * Class.forName("com.mysql.jdbc.Driver"); Connection c =
		 * DriverManager.getConnection("jdbc:mysql://localhost/springbook","spring",
		 * "book");
		 */
		//Connection c = getConnection();
		//Connection c = simpleConnectionMaker.getConnection();
		//this.c = connectionMaker.makeConnection();
		
		Connection c = dataSource.getConnection();
		PreparedStatement ps = c.prepareStatement("SELECT * FROM USERS WHERE ID = ?");
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		this.user = new User();
		this.user.setId(rs.getString("id"));
		this.user.setName(rs.getString("name"));
		this.user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		c.close();
		
		return this.user;
	}
	
	/*
	 * private Connection getConnection() throws ClassNotFoundException,
	 * SQLException { Class.forName("com.mysql.jdbc.Driver"); Connection c =
	 * DriverManager.getConnection("jdbc:mysql://localhost/springbook","spring",
	 * "book"); return c; }
	 */
	
	//public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
	
}