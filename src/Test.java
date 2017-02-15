import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.vo.User;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionfactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		List<User> users = session.createQuery("from User").list();
		for (User user : users) {
			System.out.println(user.toString());
		}

	}
}
