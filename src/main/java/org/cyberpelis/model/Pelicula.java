package org.cyberpelis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tb_peliculas")
@Data

public class Pelicula {
	@Id
	private int codpelicula;
	private String nompelicula;
	
	@ManyToOne
	@JoinColumn(name="codgenero", insertable=false, updatable=false)
	private Genero genero;
	private int codgenero;
	
	@ManyToOne
	@JoinColumn(name="codclas", insertable=false, updatable=false)
	private Clasificacion clasificacion;
	private int codclas;
	
	private String paispelicula;
	private String populpelicula;
}
