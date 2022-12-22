package com.tech.exp.repo;

import com.tech.exp.entity.Baby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BabyRepository extends JpaRepository<Baby,Integer> {
}
