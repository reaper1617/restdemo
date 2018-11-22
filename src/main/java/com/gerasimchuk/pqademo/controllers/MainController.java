package com.gerasimchuk.pqademo.controllers;

import com.gerasimchuk.pqademo.services.interfaces.ExtDataChangeProtVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/main")
public class MainController {

    private ExtDataChangeProtVService extDataChangeProtVService;

    @Autowired
    public MainController(ExtDataChangeProtVService extDataChangeProtVService) {
        this.extDataChangeProtVService = extDataChangeProtVService;
    }

    @RequestMapping(value = "/secondpage", method = RequestMethod.GET)
    public String index(Model ui){
        //ui.addAttribute("extDataChangeProtVList", extDataChangeProtVService.getAllRecords());
        return "secondpage";
    }


}
