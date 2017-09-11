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
		
		Tarefas tarefa2 = new Tarefas();
		tarefa2.setDataFinalizacao("10/02/2016");
		tarefa2.setDescricao("Tarefa secundária. ");
		tarefa2.setFinalizado(true);
		
		Tarefas tarefa3 = new Tarefas();
		tarefa3.setDataFinalizacao("02/05/2017");
		tarefa3.setDescricao("Modificar atualização de registros.");
		tarefa3.setFinalizado(true);
		
		manager.getTransaction().begin();
		manager.persist(tarefa1);
		manager.persist(tarefa2);
		manager.persist(tarefa3);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		

	}

}
