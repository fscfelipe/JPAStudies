package model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tarefas")
public class Tarefas {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String descricao;
	private boolean finalizado;

	/*
	 * Se não for utilizado o @JoinColumn será criado uma outra tabela
	 * para adicionar os dados da relação.
	 * 
	 * A relação utilizando conceito Unidirecional
	 *  - @OneToMany
	 *  - @JoinColumn
	 * Sem adicionar campos na outra entidade, funcionará.
	 * Sendo que o 'nome' para o campo da JoinColumn, será a
	 * ForeignKey da tabela d entidade da lista.
	 * 
	 * A Relação utilizando o conceito Bidirecional
	 *  - @OneToMany(mappedBy = '')
	 *  e adicionar os campos na outra entidade.
	 * 
	 */

	// @OneToMany
	// @JoinColumn(name = "tarefa_id")
	// @OneToMany(mappedBy = "tarefa")
	//private List<fake> fakes;

	// @Temporal(TemporalType.DATE)
	// @Column(name = "data_finalizado", nullable = true)
	// private Calendar dataFinalizacao;
	private String dataFinalizacao;

	public Tarefas() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public String getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(String dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}
