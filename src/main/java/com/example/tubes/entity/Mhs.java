package com.example.tubes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mhs")
public class Mhs {
    @Id
    @GeneratedValue
    private int id;
    private String nim;
    private String nama;
    private String prodi;
    private String no_hp;
}
