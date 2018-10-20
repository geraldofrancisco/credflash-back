package com.consignado.api.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema="consulta", name="pan")
@EqualsAndHashCode(of= {"oid"})
public class CartaoPan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long oid;
	
	@Getter
	@Setter
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="oid_consulta")
	private ConsultaPan consultaPan;
	
	@Getter
	@Setter
	@Column(name="limite_saque_total")
	private Double limiteSaqueTotal;
	
	@Getter
	@Setter
	@Column(name="limite_saque_disponivel")
	private Double limiteSaqueDisponivel;
	
	@Getter
	@Setter
	@Column(name="margem_livre")
	private Double margemLivre;
	
}
