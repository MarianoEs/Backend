package com.portfolio.MarianoEs.repository;

import com.portfolio.MarianoEs.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;







@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    
}