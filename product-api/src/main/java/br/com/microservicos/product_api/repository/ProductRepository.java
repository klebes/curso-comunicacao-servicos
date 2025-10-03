package br.com.microservicos.product_api.repository;

import br.com.microservicos.product_api.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Producto, Integer> {

}
