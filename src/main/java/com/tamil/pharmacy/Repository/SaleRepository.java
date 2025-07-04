package com.tamil.pharmacy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tamil.pharmacy.Model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
