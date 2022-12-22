package mvc.DAO;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import mvc.entities.User;
import mvc.utils.hibernateUtils;


@Repository
public class UserDAO {
	
	private SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
	
	public boolean createUser(User user) {
		try(Session session = sessionFactory.openSession();) {
			Transaction txTransaction = session.beginTransaction();
			session.save(user);
			txTransaction.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<User> getAllUser() {
		try(Session session = sessionFactory.openSession();) {
			String HQL = "FROM User";
			return session.createQuery(HQL, User.class).getResultList();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return Collections.EMPTY_LIST;
	}

}
