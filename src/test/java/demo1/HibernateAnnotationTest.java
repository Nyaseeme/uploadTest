package demo1;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PERSIST_STORE;

import hibernatedomian.Permission;
import hibernatedomian.Role;
import hibernatedomian.User;


public class HibernateAnnotationTest {

	// �������
		private Configuration config;
		private SessionFactory sessionFactory;
		private Session session;
		private Transaction transaction;

		// before��ʾ�ڷ���ִ��ǰִ��
		@Before
		public void setUp() {
			// 1.����hibernate.cfg.xml����
			config = new Configuration().configure("hibernate.cfg2.xml");
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
		public void test() {  // ����
			
			    Role role = new Role();  
		        role.setRolename("AAA");  
		        
		        Permission per1 = new Permission();  
		        per1.setPermission("aaaaa");  
		        
		        Permission per2 = new Permission();
		        per2.setPermission("BBB");
		        
		        Set<Permission> pers = new HashSet<Permission>();  
		        pers.add(per1); 
		        pers.add(per2);
		        role.setPermissions(pers);  
		          
		        session.save(per1);  
		        session.save(per2);  
		        session.save(role);  
	       
			/*
			Role role = (Role)session.createQuery("from Role role where role.id = '2'").list().get(0);  
	        session.delete(role);  
	        */
		        
			/*
			User u = new User();  
	        u.setUsername("xxx");  
	        session.save(u);
	        */
		        
			/*
			   Role role = new Role();  
		        role.setRolename("test");  
		        User u = (User)session.createQuery("from User user where user.id = '3'").list().get(0);  
		        u.setRole(role);  
		        session.save(role);  
		        session.update(u);  
			*/
			
			/*
			 Role role = (Role)session.createQuery("from Role role where role.id = '4'").list().get(0);  
	          
		        Set<Permission> pers = new HashSet<Permission>();  
		          
		        for(int i = 0;i < 9;i++){  
		            Permission per = new Permission();  
		            per.setPermission("permission" + i);  
		              
		            pers.add(per);  
		            session.save(per);  
		        }  
		          
		        role.setPermissions(pers);  
		        session.update(role);  
		      */
			
		}
		
}
