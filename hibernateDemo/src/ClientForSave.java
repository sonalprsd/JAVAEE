import org.hibernate.*;
import org.hibernate.cfg.*;

public class ClientForSave {
	
	public static void main(String[] args)
	{
 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Employee e=new Employee();
 
		e.setEmpId(102);
		e.setEmpName("SP");
		e.setEmpDesignation("SDE");
 
		Transaction tx = session.beginTransaction();
		session.save(e);
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	}

}
