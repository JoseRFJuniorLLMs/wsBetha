package com.jersey.persistence;

import com.jersey.representations.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoasDao extends JpaRepository<Pessoas, Long> {

    
}