package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fake")
public class fake {

	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	/*
	 * A utilização das anotações @ManyToOne e JoinColumn nessa entidade é para
	 * estabelecer uma relação bidirecional com a entidade tarefa.
	 */

	// @ManyToOne
	// @JoinColumn(name = "tarefa_id")
	//private Tarefas tarefa;

	public fake() {

	}

}
