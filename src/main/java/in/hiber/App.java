package in.hiber;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("abhi");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		Student student=new Student();
		student.setId(1);
		Teacher teacher=new Teacher(1,"suraj sir","junior devloper",student);
		student.setNameString("sakshi");
		student.setMark(100);
		student.setAddressString("pune");
		entityManager.persist(teacher);
		entityManager.persist(student);
		entityTransaction.commit();

	}

}
