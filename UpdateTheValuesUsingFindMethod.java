package HaibarnetAssignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTheValuesUsingFindMethod {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	CreateTable createTable=entityManager.find(CreateTable.class, 123457);

	createTable.setName("GovindaRaju");
	createTable.setPnone(6648756677l);
	
	entityTransaction.begin();
	entityManager.merge(createTable);
	entityTransaction.commit();
	System.out.println("The data is updated");
}
}
