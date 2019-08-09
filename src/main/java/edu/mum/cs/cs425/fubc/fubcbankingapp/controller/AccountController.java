package edu.mum.cs.cs425.fubc.fubcbankingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping(value = "/efubcbanking/account/list")
    public String displayAccountList() {
        return "";
    }
}
