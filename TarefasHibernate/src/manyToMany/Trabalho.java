package manyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Trabalho {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "trabalhos")
	private List<PessoaMany> funcionarios;
}
