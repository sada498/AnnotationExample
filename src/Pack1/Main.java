package Pack1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Student s=new Student();
		s.setStudentId(498);
		s.setStudentName("sada");
		s.setMarks(99);
		Transaction tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		factory.close();
	}

}
