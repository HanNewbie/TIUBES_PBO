package com.example.tubes.controller;

import com.example.tubes.entity.Mhs;
import com.example.tubes.service.MhsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/mhs")
public class MhsController {
    @Autowired
    private MhsService service;

    @GetMapping("")
    public ModelAndView getAllMhs() {
        List<Mhs> list = service.get();
        return new ModelAndView("mahasiswa/index","mhss",list);
    }

    @GetMapping("/add")
    public String addMhs(){
        return "mahasiswa/create";
    }

    @GetMapping("/update/{id}")
    public String updateMhs(@PathVariable("id") int id, Model model) {
        Mhs mhs = service.getById(id);
        model.addAttribute("mhs",mhs);
        return "mahasiswa/edit";
    }

    @PostMapping("/delete/{id}")
    public String deleteMhs(@PathVariable("id") int id) {
        service.deleteById(id);
        return "redirect:/mhs";
    }

    @PostMapping("/mahasiswa")
    public String mahasiswa(@ModelAttribute Mhs mhs) {
        service.save(mhs);
        return "redirect:/mhs";
    }
}
