package br.com.thiagocrispim.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiagocrispim.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
