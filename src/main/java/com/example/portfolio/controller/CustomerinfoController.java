package com.example.portfolio.controller;

import com.example.portfolio.service.CustomerinfoService;
import com.example.portfolio.model.Customerinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/customerinfo")

public class CustomerinfoController {

    @Autowired
    CustomerinfoService service;

    @GetMapping("/all")
    public List<Customerinfo> getAllCustomerinfo() {
        return service.getAllCustomerinfo();
    }
}