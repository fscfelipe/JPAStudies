package mainTeste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Tarefas;

public class ConsultasEntidadeJPQL {

	public static void main(String[] args) {
		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		// Implementada como um objeto *Query* ou *TypedQuery*
		// as consultas podem ser determinadas tanto estaticamente (NamedQueries)
		// como dinamicamente (pode ser emitidade em tempo de execução).
		
		// obs.: O nome da tabela na cláusula FROM precisa ser o nome da classe ao qual ela
		// referência.
		TypedQuery<Tarefas> consulta = manager.createQuery("SELECT tar FROM Tarefas tar", Tarefas.class);
		
		List<Tarefas> lista = consulta.getResultList();
		
		for(Tarefas tar: lista) {
			System.out.println(tar.getDescricao());
		}

	}

}
