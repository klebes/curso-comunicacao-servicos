package br.com.microservicos.product_api.repository;

import br.com.microservicos.product_api.model.Supplier;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
