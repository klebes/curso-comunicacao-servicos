package br.com.microservicos.product_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Producto")
public class Producto {
    private Integer id;
    private String name;
    private Category category;
    private Supplier supplier;
}
