package com.tamil.pharmacy.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Entity
@Data
public class Supplier {
    @Id
    private Long id;
    private String name;
    private String contactInfo;
      @OneToMany(mappedBy = "supplier")
    private List<Medicine> medicines;
    public Supplier(Long id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }
    public Supplier() {
    }

}
