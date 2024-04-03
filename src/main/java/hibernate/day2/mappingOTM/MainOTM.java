package hibernate.day2.mappingOTM;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOTM {

	public static void main(String[] args) {
		
		Users users = new Users();
		users.setName("Ashenafi");
		users.setPassWord("236598");
		
		Roles roles = new Roles();
		roles.setName("admin");
		
		roles.setUsers(users);
		
		Roles roles2 = new Roles();
		roles2.setName("teacher");
		
		roles2.setUsers(users);
		
		users.getRoles().add(roles);
		users.getRoles().add(roles2);


		Configuration configuration = new Configuration();
		
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Roles.class).addAnnotatedClass(Users.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		//Insert
		session.save(users);
		
		//Update
//		int num = 1;
//		
//		Roles updateRoles = session.get(Roles.class, num);
//		
//		updateRoles.setName("SuperAdmin");
//		
//		session.update(updateRoles);
		
		//Delete
//		int num = 2;
//		
//		Roles deleteRoles = session.get(Roles.class, num);
//		
//		session.delete(deleteRoles);
		
		//Select
//		String st = "FROM Roles";
//		
//		List<Roles> roles2 = session.createQuery(st, Roles.class).getResultList();
//		
//		System.out.println(roles2);
		
		transaction.commit();
		
		sessionFactory.close();

	}

}
