package br.uninove.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.uninove.modelo.Usuario;

public class Consultar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 3);
		
		System.out.println("Código: "+usuario.getCodigo());
		System.out.println("Nome: "+usuario.getNome());
		System.out.println("Login: "+usuario.getLogin());
		System.out.println("Senha: "+usuario.getSenha());
	}

}
