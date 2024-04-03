package hibernate.OTM.mapping.assignment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		
		//Create an Object for Policy_type
		Policy_type policy_type = new Policy_type();
		
		policy_type.setPolicy_type_name("Geoco");
		policy_type.setDescription("Covers damage, theft, or bodily injury");
		
		//Create an Object for Policy
		Policy policy = new Policy();
		
		policy.setPolicy_name("Auto Insurance");
		policy.setDescription("legal contract between the insurance company and the person being insured");
		
		policy.setPolicy_type(policy_type);
		
		Policy policy2 = new Policy();
		policy2.setPolicy_name("Home Insurance");
		policy2.setDescription("legal contract between the insurance company and the person being insured");
		
		policy2.setPolicy_type(policy_type);
		
		policy_type.getPolicy().add(policy);
		policy_type.getPolicy().add(policy2);
		
		
		//Create an Object for Role_type
		
		Role_type role_type = new Role_type();
		
		role_type.setRole_name("Agent");
	
		
		//Create an Object for User
		User user = new User();
		
		user.setFname("King");
		user.setLname("Menilek");
		user.setAddress("4 Killo");
		user.setPhone("911911911");
		user.setEmail("menilek@gmail.com");
		user.setPassword("Adwa");
		
		user.setRole(role_type);
		
		User user2 = new User();
		
		user2.setFname("Sew");
		user2.setLname("Mehon");
		user2.setAddress("Ledeta");
		user2.setPhone("51515151");
		user2.setEmail("sew@gmail.com");
		user2.setPassword("Africa");
		
		user2.setRole(role_type);
		
		role_type.getUser().add(user);
		role_type.getUser().add(user2);
		
		
		//Create an Object for User_policy
		User_policy user_policy = new User_policy();
		
		user_policy.setOffered_date("01/01/2024");
		user_policy.setExpiry_date("06/30/2024");
		user_policy.setIs_active("True");
		
		user_policy.setPolicy(policy);
		
		user_policy.setUser(user);
		
		User_policy user_policy2 = new User_policy();
		
		user_policy2.setOffered_date("03/01/2024");
		user_policy2.setExpiry_date("09/01/2024");
		user_policy2.setIs_active("True");
		
		user_policy2.setPolicy(policy);
		
		policy.getRoles().add(user_policy);
		policy.getRoles().add(user_policy2);
		
		user_policy2.setUser(user);
		
		user.getRoles().add(user_policy);
		user.getRoles().add(user_policy2);
		
		
		

		
		Configuration configuration = new Configuration();
		
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Policy_type.class).addAnnotatedClass(Policy.class).addAnnotatedClass(User_policy.class).addAnnotatedClass(User.class).addAnnotatedClass(Role_type.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
//		//Insert
		session.save(policy_type);
		
		session.save(policy);
		
		session.save(user);
		
		session.save(role_type);
		
		
//		//Update
//		int num = 1;
//		
//		Policy updatePolicy = session.get(Policy.class, num);
//		User_policy updateUser_policy = session.get(User_policy.class, num);
//		User updateUser = session.get(User.class, num);
//		
//		updatePolicy.setPolicy_name("Life Insurance");
//		updateUser_policy.setExpiry_date("12/31/2024");
//		updateUser.setFname("King of King");
//		
//		session.update(updatePolicy);
//		session.update(updateUser_policy);
//		session.update(updateUser);
//		
//		
//		//Delete
//		int value = 2;
//		
//		Policy deletePolicy = session.get(Policy.class, value);
//		User_policy deleteUser_policy = session.get(User_policy.class, value);
//		User deleteUser = session.get(User.class, value);
//		
//		session.delete(deletePolicy);
//		session.delete(deleteUser_policy);
//		session.delete(deleteUser);
//		
//		//Select
//		String st1 = "FROM Policy";
//		String st2 = "FROM User_policy";
//		String st3 = "FROM User";
//		
//		List<Policy> policy3 = session.createQuery(st1, Policy.class).getResultList();
//		List<User_policy> user_policy3 = session.createQuery(st2, User_policy.class).getResultList();
//		List<User> user3 = session.createQuery(st3, User.class).getResultList();
//		
//		System.out.println(policy3);
//		System.out.println(user_policy3);
//		System.out.println(user3);
		
		transaction.commit();
		
		sessionFactory.close();

	}

}
