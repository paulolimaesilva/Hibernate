package testes;

//TestaInsereProduto.java 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import entities.Produto;

public class TestaInsereProduto {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("hibernate");
		EntityManager em = factory.createEntityManager();
		Produto p = new Produto();
		p.setNome("camisa");
		p.setPreco(12.30);
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}
}
