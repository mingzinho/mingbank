package br.com.mingbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mingbank.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
