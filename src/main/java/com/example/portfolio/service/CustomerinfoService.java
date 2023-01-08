package com.example.portfolio.service;

import com.example.portfolio.customerinforepository.CustomerinfoRepository;
import com.example.portfolio.model.Customerinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerinfoService {

    @Autowired
    CustomerinfoRepository repo;

    public List<Customerinfo> getAllCustomerinfo(){
        return repo.findAll();
}
}