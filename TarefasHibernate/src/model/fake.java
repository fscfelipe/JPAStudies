package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fake")
public class fake {
	
	@Id
	@GeneratedValue
	private Long id;
	
	public fake() {
		
	}

}
