package com.tamil.pharmacy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tamil.pharmacy.Model.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}
