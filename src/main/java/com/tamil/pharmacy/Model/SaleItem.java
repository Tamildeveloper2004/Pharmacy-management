package com.tamil.pharmacy.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class SaleItem {
    @Id
    private Long id;
    private int quantity;
    private double unitPrice;
      @ManyToOne
    @JoinColumn(name = "medicine_id")
    private Medicine medicine;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;
    public SaleItem(Long id, int quantity, double unitPrice) {
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public SaleItem() {
    }
    
}
