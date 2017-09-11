import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tarefas;

public class BuscarEntidade {

	public static void main(String[] args) {
		
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		// Veja que o Id da tarefa é buscado como tipo long.
		Tarefas tarefaEncontrada = manager.find(Tarefas.class, 6L);
		
		System.out.println(tarefaEncontrada.getDescricao());

	}

}
