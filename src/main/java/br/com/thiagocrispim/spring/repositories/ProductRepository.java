package br.com.thiagocrispim.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiagocrispim.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
