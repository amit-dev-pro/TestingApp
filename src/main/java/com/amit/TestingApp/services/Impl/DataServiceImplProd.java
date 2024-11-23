package com.amit.TestingApp.services.Impl;

import com.amit.TestingApp.services.DataService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Prod")
public class DataServiceImplProd implements DataService {
    @Override
    public String getData() {
        return "Prod data";
    }
}
