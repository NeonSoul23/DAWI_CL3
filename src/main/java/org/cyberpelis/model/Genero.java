package org.cyberpelis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tb_generos")
@Data

public class Genero {
	@Id
	private int codgenero;
	private String nomgenero;
	private String subgenero;
}
