package com.springapp.mvc.entities;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aleksandrs on 12/27/13.
 */
public interface ComputerRepository extends JpaRepository<Pc, Long> {
}
