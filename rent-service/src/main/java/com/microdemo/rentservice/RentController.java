package com.microdemo.rentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rent")
public class RentController {

    @GetMapping()
    public String get(){
        return "Rent service 2020";
    }
}
