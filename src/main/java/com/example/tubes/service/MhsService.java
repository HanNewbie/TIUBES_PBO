package com.example.tubes.service;

import com.example.tubes.entity.Mhs;
import com.example.tubes.repository.MhsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MhsService {
    @Autowired
    private MhsRepo MRepo;

    public void save(Mhs mhs){
        MRepo.save(mhs);
    }

    public List<Mhs> get(){
        return MRepo.findAll();
    }

    public Mhs getById(int id){
        return MRepo.findById(id).get();
    }

    public void deleteById(int id){
        MRepo.deleteById(id);
    }
}
