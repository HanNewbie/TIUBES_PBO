package com.example.tubes.service;

import com.example.tubes.entity.Dsn;
import com.example.tubes.entity.Mhs;
import com.example.tubes.repository.DsnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DsnService {
    @Autowired
    private DsnRepo DRepo;

    public void save(Dsn dsn){
        DRepo.save(dsn);
    }

    public List<Dsn> get(){
        return DRepo.findAll();
    }

    public Dsn getById(int id){
        return DRepo.findById(id).get();
    }

    public void deleteById(int id){
        DRepo.deleteById(id);
    }

}
