package org.cyberpelis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tb_clasificacion")
@Data

public class Clasificacion {
	@Id
	private int codclas;
	private String nombreclas;
	private String desclas;
}
