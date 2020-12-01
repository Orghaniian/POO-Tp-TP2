package com.example.tp5.controller;

import com.example.tp5.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/adresses")
    public String ShowAddresses(Model model){
        model.addAttribute("allAddresses",
                addressRepository.findAll());
        return "addresses";
    }

    @GetMapping("/adresse")
    public String ShowAddress(Model model){
        return "address";
    }
}
