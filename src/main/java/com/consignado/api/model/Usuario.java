package com.consignado.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema="cadastro", name="usuario")
@EqualsAndHashCode(of= {"oid"})
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long oid;
	
	@CPF
	@NotBlank
	@Getter
	@Setter
	private String cpf;
	
	@NotBlank
	@Getter
	@Setter
	private String email;
	
	@Getter
	@Setter
	private Boolean master;
	
	@NotBlank
	@Getter
	@Setter
	private String nome;
}
