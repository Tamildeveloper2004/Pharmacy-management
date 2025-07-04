package com.tamil.pharmacy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.pharmacy.Model.Sale;
import com.tamil.pharmacy.Repository.SaleRepository;

@Service
public class SaleService {

    @Autowired
    private SaleRepository SalRepo;

    public List<Sale> getallSale() {
        return SalRepo.findAll();
    }

    public void addSale(Sale sale) {
        SalRepo.save(sale);
    }

    public void updateSale(Sale sale) {
       SalRepo.save(sale);
    }

    public void deletesale(long id) {
        SalRepo.deleteById(id);
    }
}
