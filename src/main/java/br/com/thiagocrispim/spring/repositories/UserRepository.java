package br.com.thiagocrispim.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.thiagocrispim.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
