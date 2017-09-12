package oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Livraria {
	
	@Id
	private int id;
	
	@OneToMany(mappedBy = "livraria")
	//@JoinColumn(name="livraria_id")
	private List<Livro> listaLivros;
	
	public Livraria() {
		
	}

}
