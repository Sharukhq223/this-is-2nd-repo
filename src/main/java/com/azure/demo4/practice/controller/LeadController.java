package com.azure.demo4.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leads")
public class LeadController {


//    echo "# deployed-our-microservice-on-git" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/Sharukhq223/deployed-our-microservice-on-git.git
//git push -u origin main












    @GetMapping("/leads/message")
    public String message(){

        return "hello this is Rest Controller & this is deployed to azure successfully!!";

    }

}
