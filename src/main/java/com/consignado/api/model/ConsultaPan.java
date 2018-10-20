package com.consignado.api.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.consignado.api.model.constantes.TipoConsultaPan;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema="consulta", name="pan")
@EqualsAndHashCode(of= {"oid"})
public class ConsultaPan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private Long oid;
	
	@Getter
	@Setter
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="oid_cliente")
	private Cliente cliente;
	
	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	private TipoConsultaPan tipo;
	
	@Getter
	@Setter
	@Column(name="data_consulta")
	private Date dataConsulta;
}
