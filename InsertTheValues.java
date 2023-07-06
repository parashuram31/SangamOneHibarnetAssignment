package HaibarnetAssignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertTheValues {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
//	CreateTable createTable=new CreateTable();
//	createTable.setId(123456);
//	createTable.setName("Pacchii");
//	createTable.setPnone(8123313552l);
	
	CreateTable createTable2=new CreateTable();
	createTable2.setId(123457);
	createTable2.setName("Raju");
	createTable2.setPnone(8123313512l);
	
	CreateTable createTable3=new CreateTable();
	createTable3.setId(123458);
	createTable3.setName("Prajju");
	createTable3.setPnone(8123313554l);
	
	CreateTable createTable4=new CreateTable();
	createTable4.setId(123459);
	createTable4.setName("Abhi");
	createTable4.setPnone(8123313556l);
	
	entityTransaction.begin();
//	entityManager.persist(createTable);
	entityManager.persist(createTable2);
	entityManager.persist(createTable3);
	entityManager.persist(createTable4);
	entityTransaction.commit();
	
	System.out.println("The values are inserted");
}
}
