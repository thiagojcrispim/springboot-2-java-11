package br.com.thiagocrispim.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.thiagocrispim.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
