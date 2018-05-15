package demo1;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import role_permission.Permission1;
import role_permission.Role1;

public class role_permission {
	
	// 定义变量
			private Configuration config;
			private SessionFactory sessionFactory;
			private Session session;
			private Transaction transaction;

			// before表示在方法执行前执行
			@Before
			public void setUp() {
				// 1.加载hibernate.cfg.xml配置
				config = new Configuration().configure();
				// 2.获取SessionFactory
				sessionFactory = config.buildSessionFactory();
				// 3.获得一个session
				session = sessionFactory.openSession();
				// 3* 获取session
//				Session currentSession = sessionFactory.getCurrentSession();
				// 4.开始事务
				transaction = session.beginTransaction();
			}
			
			@After
			public void info() {
				transaction.commit();
			}

			
			@Test
			public void test() {
				Permission1 p1 = new Permission1(null, "111", "111");
				Permission1 p2 = new Permission1(null, "222", "222");
				ArrayList<Permission1> plist = new ArrayList<>();
				plist.add(p2);
				plist.add(p1);
				Role1 role1 = new Role1(null, "role....", "desc...", plist);
//				session.save(role1);
				Permission1 p3 = new Permission1(null, "333", "333");
				Permission1 p4 = new Permission1(null, "444", "444");
				Role1 role2 = new Role1(null, "role2", "role2", null);
//				session.save(p3);
//				session.save(p4);
//				session.save(role2);
				Permission1 permission1 = session.get(Permission1.class, 2L);
				Permission1 p5 = new Permission1(null, "555", "555");
				ArrayList<Permission1> list = new ArrayList<Permission1>();
				list.add(permission1);
				list.add(p5);
				Role1 role3 = new Role1(null, "role3", "role3", list);
//				session.save(role3); //2-5
				Role1 setrole = session.get(Role1.class, 1L); 
				Permission1 permission12 = session.get(Permission1.class, 5L);  // 2-3
				Permission1 p6 = new Permission1(null, "666", "666");
				List<Permission1> plist2 = setrole.getPlist();
				for (int i = 0; i < plist2.size(); i++) {
					if (plist2.get(i).getId() == 2) {
						plist2.remove(i);
						break;
					}
				}
				plist2.add(p6);  // 6
				plist2.add(permission12); //5
//				session.save(setrole); //23-->356
				System.out.println(session.get(Role1.class, 1L));
				
			}

			
			@Test
			public void test1() {
				Role1 role1 = session.get(Role1.class, 1L);
				System.out.println("---------"+role1);
				role1.getPlist().clear();
				session.save(role1);
				System.out.println("---------"+session.get(Role1.class, 1L));
			}
			
			@Test
			public void arrayTest() {
				Object[] obj = new Object[7];
				obj[1] = new Permission1(2L, "AA", "BB");
				System.out.println(obj);
				System.out.println(new Role1());
				System.out.println(obj instanceof Object);
				System.out.println(obj.hashCode());
			}
			
			@Test
			public void servletTest() {
//				Servlet
				
			}
			
}
