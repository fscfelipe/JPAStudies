package criteria;

import java.util.List;

import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.criterion.CriteriaQuery;

import model.Tarefas;

public class ConsultasBasicas {
	
	@PersistenceContext
	private Session session;
	
	// Criteria do Hibernate está Deprecated !!
	
	
	public ConsultasBasicas() {
		
	}
	
	public List<Tarefas> listaTarefas(){
		
		
		
		return null;
	}

}
