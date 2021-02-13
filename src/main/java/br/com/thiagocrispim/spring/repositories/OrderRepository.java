package br.com.thiagocrispim.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.thiagocrispim.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
