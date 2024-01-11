package com.example.tubes.repository;

import com.example.tubes.entity.Dsn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DsnRepo extends JpaRepository<Dsn, Integer> {
}
