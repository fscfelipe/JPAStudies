package oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Livro {
	
	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "livraria_id")
	private Livraria livraria;
	
	public Livro() {
		
	}

}
