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

import com.tamil.pharmacy.Model.Supplier;
import com.tamil.pharmacy.Service.SupplierService;

@RestController
public class SupplierController {

    @Autowired
    private SupplierService SupSer;

    @GetMapping("Supplier")
    public List<Supplier> getallsupplier(){
        return SupSer.getallsupplier();
    }

    @PostMapping("Supplier")
    public String addsupplier(@RequestBody Supplier supplier){
        SupSer.addsupplier(supplier);
        return "added";
    }

    @PutMapping("Supplier")
    public String updatesupplier(@RequestBody Supplier supplier){
        SupSer.updatesupplier(supplier);
        return "updated";
    }

    @DeleteMapping("Supplier/{id}")
    public String deletesupplier(@PathVariable long id){
        SupSer.deletesupplier(id);
        return "deleted";
    }
}
