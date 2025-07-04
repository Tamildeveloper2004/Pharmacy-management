package com.tamil.pharmacy.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class Medicine {
    @Id
    private Long id;
    private String name;
    private String category;
    private int quantity;
    private double price;
     @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
    public Medicine(Long id, String name, String category, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }
    public Medicine() {
    }



}
