package demo1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entity.Account;
import entity.T1;

public class onetomany {

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
//				Session currentSession = sessionFactory.getCurrentSession();
				// 4.��ʼ����
				transaction = session.beginTransaction();
			}
			
			@After
			public void info() {
				transaction.commit();
			}
			
			@Test
			public void test() {  // һ�Զౣ��
			  T1 t1 = new T1(0, "HHHH", "2222", new HashSet<>());
			  Account account1 = new Account(0, 101, null);
			  Account account2 = new Account(0, 108, null);
			  
			  t1.getAlist().add(account1);
			  t1.getAlist().add(account2);
			  
			  session.save(t1);
			  session.save(account1);
			  session.save(account2);
			}

			@Test
			public void list() {
				/*
				List list = session.createCriteria(T1.class).list();
				for (Object object : list) {
					System.out.println(object);
				}
				*/
				T1 t1 = session.get(T1.class, 15);
				System.out.println(t1);
			}
}
