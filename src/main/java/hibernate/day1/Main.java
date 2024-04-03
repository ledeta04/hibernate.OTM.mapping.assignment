package hibernate.day1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		//Create an Object
		GoogleMap g = new GoogleMap("485792k", "5654789m", "20011");
		
		//Configuration
		Configuration conf = new Configuration();
		
		conf.configure("hibernate.cfg.xml").addAnnotatedClass(GoogleMap.class);
		
		//Session Factory to create session
		SessionFactory sf = conf.buildSessionFactory();
		
		//Session to connect with Database
		Session se = sf.openSession();
		
		//Transaction to perform DML Query
		Transaction tr = se.beginTransaction();
		
		//Insert data to database
//		se.save(g);
		
		//commit to database
		tr.commit();
		
		//Select Data
		int id = 1;
		
		GoogleMap goo = se.get(GoogleMap.class, id);
		
		System.out.println(goo);
		
		//Update Data
		se.update(goo);
		
		//delete Data
		se.delete(goo);
		
		
		//Session Close
		se.close();
	}

}
