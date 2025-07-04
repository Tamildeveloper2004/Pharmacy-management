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

import com.tamil.pharmacy.Model.Sale;
import com.tamil.pharmacy.Service.SaleService;

@RestController
public class SaleController {

    @Autowired
    private SaleService SalSer;

    @GetMapping("Sale")
    public List<Sale> getallSale(){
       return SalSer.getallSale();
    }
    @PostMapping("Sale")
    public String addSale(@RequestBody Sale sale){
        SalSer.addSale(sale);
        return "added";
    }
    @PutMapping("Sale")
    public String updateSale(@RequestBody Sale sale){
        SalSer.updateSale(sale);
        return "updated";
    }
    @DeleteMapping("Sale/{id}")
    public String deletesale(@PathVariable long id){
        SalSer.deletesale(id);
        return "deleted";
    }
}
