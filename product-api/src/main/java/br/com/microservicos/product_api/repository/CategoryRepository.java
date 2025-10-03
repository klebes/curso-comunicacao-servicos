package br.com.microservicos.product_api.repository;

import br.com.microservicos.product_api.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
