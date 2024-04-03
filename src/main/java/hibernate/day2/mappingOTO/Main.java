package hibernate.day2.mappingOTO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		//Configuration
		Configuration conf = new Configuration();
		
		conf.configure("hibernate.cfg.xml").addAnnotatedClass(Address.class).addAnnotatedClass(Location.class);
		
		//Session Factory to create session
		SessionFactory sf = conf.buildSessionFactory();
		
		//Session to connect with Database
		Session se = sf.openSession();
		
		//Transaction to perform DML Query
		Transaction tr = se.beginTransaction();
		
		//Create an Object for Location
		Location location = new Location();
		
		
//		location.setName("Ethiopia");
		
		//Create an Object for Address
		Address address = new Address();
		
//		address.setStreet("Ledeta");
//		address.setCity("Addis Ababa");
		
		//Cascade set up
		location.setAddress(address);
		address.setLocation(location);
		
		//To insert data We set up cascade on Location so just need to save this side only
//		se.save(location);
		
		
		//Update
//		int updateLoc = 3;
//		Address updateAddress = se.get(Address.class, updateLoc);
//		
//		updateAddress.setCity("New York");
//		updateAddress.setStreet("14th st Manhatan");
//		
//		se.update(updateAddress);
		
		//Delete
//		int deleteAddr = 4;
//		
//		Address deleteAddress = se.get(Address.class, deleteAddr);
//		
//		
//		se.delete(deleteAddress);
		
		//Select
		

		Location  location2=  se.get(Location.class, 1);
		
		System.out.println(location2);
		
		
		
		
		
		tr.commit();
		
		se.close();
		
		sf.close();
		
	}

}
