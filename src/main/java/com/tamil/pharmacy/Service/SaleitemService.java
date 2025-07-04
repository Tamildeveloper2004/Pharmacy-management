package com.tamil.pharmacy.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.pharmacy.Model.SaleItem;
import com.tamil.pharmacy.Repository.SaleitemRepository;
@Service
public class SaleitemService {

    @Autowired
    private SaleitemRepository SalitRepo;

    public List<SaleItem> getallSaleitem() {
        return SalitRepo.findAll();
    }

    public void addsaleitem(SaleItem saleItem) {
        SalitRepo.save(saleItem);
    }

    public void updatesaleitem(SaleItem saleItem) {
        SalitRepo.save(saleItem);
    }

    public void deletesaleitem(long id) {
        SalitRepo.deleteById(id);
    }
   
}
