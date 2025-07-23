package com.xworkz.flounder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PoliceStationController {
    public PoliceStationController() {
        System.out.println("created PoliceStationController...");
    }
    @RequestMapping("/sendStation")
    public String onGetStation(@RequestParam String stationName, @RequestParam String stationCode, @RequestParam String location, @RequestParam String city, @RequestParam String state, @RequestParam String pincode, @RequestParam String contactNumber, @RequestParam String stationInCharge, @RequestParam String totalStaff, @RequestParam String emergencyAvailable){
        System.out.println("running onGetStation in PoliceStationController");
        System.out.println("stationName: "+stationName);
        System.out.println("stationCode: "+stationCode);
        System.out.println("location: "+location);
        System.out.println("city: "+city);
        System.out.println("state: "+state);
        System.out.println("pincode: "+pincode);
        System.out.println("contactNumber: "+contactNumber);
        System.out.println("stationInCharge: "+stationInCharge);
        System.out.println("totalStaff: "+totalStaff);
        System.out.println("emergencyAvailable: "+emergencyAvailable);
        return "/PoliceStationResult.jsp";
    }
}
