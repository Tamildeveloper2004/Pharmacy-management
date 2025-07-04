package com.tamil.pharmacy.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tamil.pharmacy.Model.SaleItem;
import com.tamil.pharmacy.Service.SaleitemService;

@RestController
public class SaleitemController {

    @Autowired
    private SaleitemService SalitSer;
    
    @GetMapping("Saleitem")
    public List<SaleItem> getallSaleitem(){
       return SalitSer.getallSaleitem();
    }

    @PostMapping("Saleitem")
    public String addsaleitem(@RequestBody SaleItem saleItem){
        SalitSer.addsaleitem(saleItem);
        return"added";
    }

    @PutMapping("Saleitem")
    public String updatesaleitem(@RequestBody SaleItem saleItem){
        SalitSer.updatesaleitem(saleItem);
        return "updated";
    }

    @DeleteMapping("Saleitem/{id}")
    public String deletesaleitem(@PathVariable long id){
        SalitSer.deletesaleitem(id);
        return "deleted";
    }
}
