package com.tamil.pharmacy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.pharmacy.Model.Medicine;
import com.tamil.pharmacy.Repository.MedicineRepository;

@Service
public class MedicineService {

    @Autowired
    private MedicineRepository MedRepo;

    public List<Medicine> getallmedicine() {
        return MedRepo.findAll();
    }

    public void addmedicine(Medicine medicine) {
        MedRepo.save(medicine);
    }

    public void updatemedicine(Medicine medicine) {
        MedRepo.save(medicine);
    }

    public void deletemedicine(long id) {
        MedRepo.deleteById(id);
    }
}
