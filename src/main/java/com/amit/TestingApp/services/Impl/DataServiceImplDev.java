package com.amit.TestingApp.services.Impl;


import com.amit.TestingApp.services.DataService;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImplDev implements DataService {


    @Override
    public String getData() {
        return "Dev data";
    }
}
