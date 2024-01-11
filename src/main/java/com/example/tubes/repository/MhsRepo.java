package com.example.tubes.repository;

import com.example.tubes.entity.Mhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MhsRepo extends JpaRepository<Mhs, Integer> {
}
