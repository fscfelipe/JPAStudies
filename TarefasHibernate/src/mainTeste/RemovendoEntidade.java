package mainTeste;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tarefas;

public class RemovendoEntidade {

	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		
		// É bom sempre antes de remover fazer uma busca para verificar se o dado está registrado
		// senão, ao tentar excluir um registro que não está no banco, será retornado um exceção.
		Tarefas tarefaParaRemover = manager.find(Tarefas.class, 7L);
		
		if(tarefaParaRemover != null) {
			manager.getTransaction().begin();
			manager.remove(tarefaParaRemover);
			manager.getTransaction().commit();
		}else {
			System.out.println("Registro não encontrado !");
		}

	}

}
