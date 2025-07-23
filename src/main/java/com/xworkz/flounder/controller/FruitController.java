package com.xworkz.flounder.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class FruitController {
    public FruitController() {
        System.out.println("created FruitController...");
    }

    @RequestMapping("/sendFruit")
    public String onGetFruit(@RequestParam String fruitName, @RequestParam String scientificName, @RequestParam String color, @RequestParam String weight, @RequestParam String taste, @RequestParam String season, @RequestParam String vitaminContent,
                             @RequestParam String price, @RequestParam String isSeedless,
                             @RequestParam String shelfLife, Model model){
        System.out.println("running onGetFruit in FruitController...");
        System.out.println("fruitName: "+fruitName);
        System.out.println("scientificName: "+scientificName);
        System.out.println("color: "+color);
        System.out.println("weight: "+weight);
        System.out.println("taste: "+taste);
        System.out.println("season: "+season);
        System.out.println("vitamincontent: "+vitaminContent);
        System.out.println("price: "+price);
        System.out.println("isSeedless: "+isSeedless);
        System.out.println("shelfLife: "+shelfLife);

        model.addAttribute("fruitName",fruitName);
        model.addAttribute("scientificName",scientificName);
        model.addAttribute("color",color);
        model.addAttribute("weight",weight);
        model.addAttribute("taste",taste);
        model.addAttribute("season",season);
        model.addAttribute("vitamincontent",vitaminContent);
        model.addAttribute("price",price);
        model.addAttribute("isSeedless",isSeedless);
        model.addAttribute("shelfLife",shelfLife);

        return "/FruitResult.jsp";
    }
}
