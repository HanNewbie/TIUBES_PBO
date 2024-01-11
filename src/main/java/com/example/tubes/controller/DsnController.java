package com.example.tubes.controller;

import com.example.tubes.entity.Dsn;
import com.example.tubes.entity.Mhs;
import com.example.tubes.service.DsnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/dsn")
public class DsnController {
    @Autowired
    private DsnService service;

    @GetMapping("")
    public ModelAndView getAllDsn() {
        List<Dsn> list = service.get();
        return new ModelAndView("dosen/index","dsnn",list);
    }

    @GetMapping("/add")
    public String addDsn(){
        return "dosen/create";
    }

    @GetMapping("/update/{id}")
    public String updateDsn(@PathVariable("id") int id, Model model) {
        Dsn dsn = service.getById(id);
        model.addAttribute("dsn",dsn);
        return "dosen/edit";
    }

    @PostMapping("/delete/{id}")
    public String deleteDsn(@PathVariable("id") int id) {
        service.deleteById(id);
        return "redirect:/dsn";
    }

    @PostMapping("/dosen")
    public String dosen(@ModelAttribute Dsn dsn) {
        service.save(dsn);
        return "redirect:/dsn";
    }
}
