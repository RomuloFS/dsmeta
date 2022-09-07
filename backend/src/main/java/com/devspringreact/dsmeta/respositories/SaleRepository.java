package com.devspringreact.dsmeta.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devspringreact.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
