package com.consignado.api.model;

import java.util.Date;

import javax.persistence.Column;
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
@Table(schema="cadastro", name="cliente")
@EqualsAndHashCode(of= {"oid"})
public class Cliente {	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long oid;
	
	@Getter
	@Setter
	private String nome;
	
	@CPF
	@NotBlank(message="O CPF não pode estar em branco")
	@Getter
	@Setter
	private String cpf;
	
	@Getter
	@Setter
	private String matricula;

	@Getter
	@Setter
	@Column(name="data_nascimento")
	private Date dataNascimento;	
	
	@Getter
	@Setter
	@Column(columnDefinition = "boolean default false")
	private Boolean falecido;
	
	public Cliente() {
		
	}
}
