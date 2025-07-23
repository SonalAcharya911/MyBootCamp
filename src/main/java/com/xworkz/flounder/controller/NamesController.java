package com.xworkz.flounder.controller;

import com.xworkz.flounder.dto.NameDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class NamesController {
    public NamesController(){
        System.out.println("created NamesController...");
    }

    @RequestMapping("/getName")
    public String onSubmit(Model model, NameDTO nameDTO){
        System.out.println("running onSubmit in NameController...");
        System.out.println("first name: "+nameDTO.getFirstName());
        System.out.println("middle name: "+nameDTO.getMiddleName());
        System.out.println("Last name: "+nameDTO.getLastName());

        nameDTO.toString();

        model.addAttribute("nameDTO",nameDTO);

        return "NameResult.jsp";
    }
}
