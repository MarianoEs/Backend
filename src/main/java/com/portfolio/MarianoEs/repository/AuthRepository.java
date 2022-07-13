
package com.portfolio.MarianoEs.repository;

import com.portfolio.MarianoEs.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Usuario, Long>{
    List<Usuario> findByEmailAndIsEnabledTrue(String email);
}