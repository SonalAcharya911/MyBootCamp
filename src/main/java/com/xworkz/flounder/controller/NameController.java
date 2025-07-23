package com.xworkz.flounder.controller;

import com.xworkz.flounder.dto.NameDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class NameController {
    public NameController(){
        System.out.println("created NameController...");
    }

    @RequestMapping("/sendName")
    public String onSubmit(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String midName, Model model, NameDTO nameDTO){
        System.out.println("running onSubmit in NameController...");
        System.out.println("first name: "+firstName);
        System.out.println("middle name: "+midName);
        System.out.println("Last name: "+lastName);

        nameDTO.setFirstName(firstName);
        nameDTO.setMiddleName(midName);
        nameDTO.setLastName(lastName);

        nameDTO.toString();

        model.addAttribute("first name",firstName);
        model.addAttribute("middle name",midName);
        model.addAttribute("Last name",lastName);
        return "NameResult.jsp";
    }
}
