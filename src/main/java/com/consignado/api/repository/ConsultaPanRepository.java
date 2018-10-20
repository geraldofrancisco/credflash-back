package com.consignado.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consignado.api.model.ConsultaPan;

@Repository
public interface ConsultaPanRepository  extends JpaRepository<ConsultaPan, Long> {
	List<ConsultaPan> findTop10ByDataConsultaIsNull();
}
