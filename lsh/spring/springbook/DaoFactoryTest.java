
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;

public class DaoFactoryTest {

	public static void main(String[] args) {
		
		DaoFactory factory = new DaoFactory();
		UserDao dao1 = factory.userDao();
		UserDao dao2 = factory.userDao();
		
		System.out.println(dao1);
		System.out.println(dao2);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao dao3 = context.getBean("userDao", UserDao.class);
		UserDao dao4 = context.getBean("userDao", UserDao.class);
		
		System.out.println(dao3);
		System.out.println(dao4);
	}
}
