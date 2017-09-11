package mainTeste;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tarefas;

public class PersistirEntidade {

	public static void main(String[] args) {
		
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefas tarefa1 = new Tarefas();
		tarefa1.setDataFinalizacao("25/09/2017");
		tarefa1.setDescricao("Testando minha primeira tarefa !!! ");
		tarefa1.setFinalizado(true);
	
		manager.getTransaction().begin();
		manager.persist(tarefa1);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		

	}

}
