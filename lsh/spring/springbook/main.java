import java.sql.SQLException;

import springbook.user.dao.ConnectionMaker;
import springbook.user.dao.DConnectionMaker;
import springbook.user.dao.NUserDao;
import springbook.user.domain.User;

public class main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//UserDao dao = new UserDao() {
		NUserDao dao = new NUserDao();
		
		User user = new User();
		user.setId("whiteship");
		user.setName("백기선");
		user.setPassword("married");
		
		dao.add(user);
		
		System.out.println(user.getId() + "등록성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + "조회성공");
	}
}