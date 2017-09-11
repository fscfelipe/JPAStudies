package mainTeste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tarefas;

public class AtualizarEntidade {

	public static void main(String[] args) {
		
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		// Para atualizar, utiliza-se o método merge() do entity manager
		// nesse caso ao criar o novo objeto com os novos dados, é necessários
		// setar o ID desse objeto com o mesmo ID do objeto que se quer atualizar
		// no banco.
		
		Tarefas tarefaAtualizar = new Tarefas();
		tarefaAtualizar.setId(6L);
		tarefaAtualizar.setDescricao("Esta tarefa foi atualizada !");
		tarefaAtualizar.setFinalizado(true);
		tarefaAtualizar.setDataFinalizacao("05/05/2017");
	
		manager.getTransaction().begin();
		manager.merge(tarefaAtualizar);
		manager.getTransaction().commit();
		
		
		
		manager.close();
		factory.close();

	}

}
