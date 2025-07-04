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

import com.tamil.pharmacy.Model.Medicine;
import com.tamil.pharmacy.Service.MedicineService;

@RestController
public class MedicineController {
    @Autowired
    private MedicineService MedSer;

    @GetMapping("Medicine")
    public List<Medicine> getallmedicine(){
        return MedSer.getallmedicine();
    }

    @PostMapping("Medicine")
    public String addmedicine(@RequestBody Medicine medicine){
        MedSer.addmedicine(medicine);
        return "added";
    }

    @PutMapping("Medicine")
    public String updatemedicine(@RequestBody Medicine medicine){
        MedSer.updatemedicine(medicine);
        return "updated";
    }

    @DeleteMapping("medicine/{id}")
    public String deletemedicine(@PathVariable long id){
        MedSer.deletemedicine(id);
        return "deleted";
    }
}
