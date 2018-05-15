package demo1;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Role;
import entity.User;

public class HibernateTest {

	// �������
		private Configuration config;
		private SessionFactory sessionFactory;
		private Session session;
		private Transaction transaction;

		// before��ʾ�ڷ���ִ��ǰִ��
		@Before
		public void setUp() {
			// 1.����hibernate.cfg.xml����
			config = new Configuration().configure();
			// 2.��ȡSessionFactory
			sessionFactory = config.buildSessionFactory();
			// 3.���һ��session
			session = sessionFactory.openSession();
			// 3* ��ȡsession
//			Session currentSession = sessionFactory.getCurrentSession();
			// 4.��ʼ����
			transaction = session.beginTransaction();
		}
		
		@After
		public void info() {
			transaction.commit();
		}

		@Test
		public void test() {  // ����Ͳ�ѯ����
			
		    /*
			Criteria criteria = session.createCriteria(User.class);
			List list = criteria.list();
			System.out.println(list);
			*/
			
//			System.out.println(session.get(User.class, 1));
//			List list = session.createCriteria(User.class).add(Restrictions.like("username", "%o%"))
//			.add(Restrictions.between("id", 2, 5)).list();
//			System.out.println(list);
			
			
			User user1 = new User();
			user1.setUsername("AA");
			user1.setBirthday(new Date());
			
			User user2 = new User();
			user2.setUsername("BB");
			user2.setBirthday(new Date());
			
			Role role1 = new Role();
			role1.setName("CC");
			role1.setDesc("CC.......");
			
			Role role2 = new Role();
			role2.setName("DD");
			role2.setDesc("DD.......");
			
			Role role3 = new Role();
			role3.setName("EE");
			role3.setDesc("EE.......");
			
			user1.getRlist().add(role1);			
			user1.getRlist().add(role2);			
			
			user2.getRlist().add(role2);
			user2.getRlist().add(role3);
			
			session.save(role1);
			session.save(role2);
			session.save(user1);
//			session.save(user2);
			
//			User user = session.get(User.class, 1);
//			session.delete(user);
			


			
//			User user2 = session.get(User.class, 1);
//			System.out.println(user2);
//			User user = new User();
//			 session.save(user);
			
			
		}
		
}
