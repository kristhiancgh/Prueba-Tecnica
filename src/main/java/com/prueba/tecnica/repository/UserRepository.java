package com.prueba.tecnica.repository;

import com.prueba.tecnica.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author KRISTHIAN
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
