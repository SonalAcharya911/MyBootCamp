package com.xworkz.flounder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HospitalController {
    public HospitalController() {
        System.out.println("created HospitalController...");
    }

    @RequestMapping("/sendHospital")
    public String onGetHospital(@RequestParam String patientName, @RequestParam String patientID,
                                @RequestParam String gender, @RequestParam String dob,
                                @RequestParam String bloodGroup , @RequestParam String phoneNumber, Model model){
        System.out.println("running onGetHospital in HospitalController...");
        System.out.println("pateintName: "+patientName);
        System.out.println("patientID: "+patientID);
        System.out.println("gender: "+gender);
        System.out.println("dob: "+dob);
        System.out.println("bloodGroup: "+bloodGroup);
        System.out.println("phoneNumber: "+phoneNumber);

        model.addAttribute("pateintName ",patientName);
        model.addAttribute("patientID",patientID);
        model.addAttribute("gender",gender);
        model.addAttribute("dob",dob);
        model.addAttribute("bloodGroup",bloodGroup);
        model.addAttribute("phoneNumber",phoneNumber);

        return "/HospitalResult.jsp";
    }
}
