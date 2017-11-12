package br.uninove.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.uninove.modelo.Usuario;

public class Salvar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario();
		usuario.setNome("Carl Jonhson");
		usuario.setLogin("cj");
		usuario.setSenha("4hunning");
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();

	}

}
