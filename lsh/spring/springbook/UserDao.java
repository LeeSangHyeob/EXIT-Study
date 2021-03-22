package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import springbook.user.domain.User;

public abstract class UserDao {
	
	public void add(User user) throws ClassNotFoundException, SQLException {
		/*
		 * Class.forName("com.mysql.jdbc.Driver"); Connection c =
		 * DriverManager.getConnection("jdbc:mysql://localhost/springbook","spring",
		 * "book");
		 */
		Connection c = getConnection();
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
		Connection c = getConnection();
		PreparedStatement ps = c.prepareStatement("SELECT * FROM USERS WHERE ID = ?");
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		c.close();
		
		return user;
	}
	
	/*
	 * private Connection getConnection() throws ClassNotFoundException,
	 * SQLException { Class.forName("com.mysql.jdbc.Driver"); Connection c =
	 * DriverManager.getConnection("jdbc:mysql://localhost/springbook","spring",
	 * "book"); return c; }
	 */
	
	public abstract Connection getConnection() throws ClassNotFoundException, SQLException;
	
	public class NUserDao extends UserDao {
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/springbook","spring", "book");
			return c;
		}
	}
	
	public class DUserDao extends UserDao {
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:oracle://localhost/springbook","spring", "book");
			return c;
		}
	}
}
