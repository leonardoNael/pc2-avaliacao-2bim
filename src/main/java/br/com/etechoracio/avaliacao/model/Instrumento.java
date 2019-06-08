package br.com.etechoracio.avaliacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="INSTRUMENTO")
public class Instrumento {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="INSTRUMENTO")
	private String instrumento;
	
	@Column(name="TIPO")
	private String tipo;
	
	@Column(name="MARCA")
	private String marca;
	
	@Column(name="PRECO")
	private Double preco;
}
