package hibernate.day1B;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainEmp {

	public static void main(String[] args) {
		
		
		Employee employee = new Employee(); 
		
		

		Configuration configuration = new Configuration();
		
		configuration.configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		
		SessionFactory factory = configuration.buildSessionFactory(); 
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		//Insert	
		employee.setAge(32);
		employee.setFirstName("Henok");
		employee.setLastName("Abdisa");
		employee.setSalary(98000);
		employee.setCountry("ETH");
		
		
		session.save(employee);
		
		
		//Update
//		int updateEmp = 6;
//		
//		Employee updateEmployee = session.get(Employee.class, updateEmp);
//		
//		
//		updateEmployee.setAge(35);
//		updateEmployee.setFirstName("Yonas");
//		updateEmployee.setLastName("Abera");
//		updateEmployee.setCountry("ETH");
//		updateEmployee.setSalary(165000);
//		
//			
//		session.update(updateEmployee);
		
		//Delete
//		int deleteEmp = 10;
//		
//		Employee deleteEmployee = session.get(Employee.class, deleteEmp);
//	
//		
//		session.delete(deleteEmployee);
		
		//Select
//		String st = "FROM Employee";
//		
//		List<Employee> employees = session.createQuery(st, Employee.class).getResultList();
//		
//		System.out.println(employees);
//		
	
		
		transaction.commit();
		
	
		session.close();
		factory.close();

	}

}
