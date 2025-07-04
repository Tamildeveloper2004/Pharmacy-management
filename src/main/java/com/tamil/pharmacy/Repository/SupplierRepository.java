package com.tamil.pharmacy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tamil.pharmacy.Model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
