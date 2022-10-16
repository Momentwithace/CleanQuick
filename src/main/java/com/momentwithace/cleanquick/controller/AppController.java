package com.momentwithace.cleanquick.controller;

import com.momentwithace.cleanquick.data.models.Customer;
import com.momentwithace.cleanquick.repositories.CustomerRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    private CustomerRepository customerRepository;

    @GetMapping("")
    public String viewHomePage(){
        return "./index.html";
    }


}
