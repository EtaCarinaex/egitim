package com.selenity.ngta.controller;

import com.selenity.ngta.service.SeleniumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class SeleniumController {

    @Autowired
    SeleniumService seleniumService;


    @GetMapping("/ilk")
    public String ilkMethod(){
        //.....
        return seleniumService.ilkServisMetodu();
    }


    @GetMapping("/veriyi-al")
    public String ikiMethod(){
        //.....


        String ab = String.valueOf(2);

        return seleniumService.haberler();
    }

}
