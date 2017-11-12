package br.uninove.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.uninove.modelo.Usuario;

public class Excluir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 2);
		
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();

	}

}
