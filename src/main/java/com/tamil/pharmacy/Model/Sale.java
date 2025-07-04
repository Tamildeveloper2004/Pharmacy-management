package com.tamil.pharmacy.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Entity
@Data
public class Sale {
    @Id
    private Long id;
    private String customerName;
     @OneToMany(mappedBy = "sale")
    private List<SaleItem> items;
    public Sale(Long id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }
    public Sale() {
    }
    
}
