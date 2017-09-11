package mainTeste;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tarefas;

public class RemovendoEntidade {

	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefas tarefaParaRemover = manager.find(Tarefas.class, 6L);
		
		manager.getTransaction().begin();
		manager.remove(tarefaParaRemover);
		manager.getTransaction().commit();

	}

}
