package com.deeptech.hibernate.work;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.work.dto.Student;
import com.deeptech.hibernate.work.utility.HibernateUtil;
public class CreateStudent {
	public static void main(String[] args) {
		Student s =new Student();
		s.setStudentname("Archana");
		s.setRollname(123);
		s.setCourse("BCA");
		// calling Hibernate Util java class
		SessionFactory sf = HibernateUtil.connection();
		 Session ses = sf.openSession();//  to open connection from the database
		 ses.beginTransaction();
		 ses.save(s);
		 System.out.println("Table Created Success and Insert Record Successfully");
		 ses.close();
		 sf.close();
	}
}
