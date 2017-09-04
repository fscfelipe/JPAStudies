package model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tarefas")
public class Tarefas {

	@Id
	@GeneratedValue
	private Long id;

	private String descricao;
	private boolean finalizado;

	/*
	 * Desta forma irá criar uma tabela adicional, é preciso modificar.. para o dado
	 * ser adicionado na tabela Tarefas.
	 */

	// @OneToMany
	// private List<fake> inteiros;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_finalizado", nullable = true)
	private Calendar dataFinalizacao;

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

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}
