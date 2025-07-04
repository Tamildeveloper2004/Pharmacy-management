package com.tamil.pharmacy.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tamil.pharmacy.Model.SaleItem;

@Repository
public interface SaleitemRepository extends JpaRepository<SaleItem, Long>{

}
