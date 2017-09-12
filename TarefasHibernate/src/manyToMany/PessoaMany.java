package manyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class PessoaMany {
	
	@Id
	private Long id;
	
	private String nome;
	
	
	
	@ManyToMany
	@JoinTable( name = "trabalhos_pessoas" )
	private List<Trabalho> trabalhos; 
	

}
