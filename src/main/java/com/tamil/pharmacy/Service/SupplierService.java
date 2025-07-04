package com.tamil.pharmacy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.pharmacy.Model.Supplier;
import com.tamil.pharmacy.Repository.SupplierRepository;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository SupRepo;

    public List<Supplier> getallsupplier() {
        return SupRepo.findAll();
    }

    public void addsupplier(Supplier supplier) {
        SupRepo.save(supplier);
    }

    public void updatesupplier(Supplier supplier) {
        SupRepo.save(supplier);
    }

    public void deletesupplier(long id) {
       SupRepo.deleteById(id);
    }
}
