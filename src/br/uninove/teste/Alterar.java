package br.uninove.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.uninove.modelo.Usuario;

public class Alterar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 1);
		
		em.getTransaction().begin();
		usuario.setNome("Pedrita Rosa");
		usuario.setLogin("prosa");
		usuario.setSenha("654321");
		em.getTransaction().commit();

	}

}
