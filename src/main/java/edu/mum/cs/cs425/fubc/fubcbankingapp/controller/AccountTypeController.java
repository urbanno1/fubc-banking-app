package edu.mum.cs.cs425.fubc.fubcbankingapp.controller;

import edu.mum.cs.cs425.fubc.fubcbankingapp.model.AccountType;
import edu.mum.cs.cs425.fubc.fubcbankingapp.service.AccountTypeService;
import edu.mum.cs.cs425.fubc.fubcbankingapp.util.ControllerLinkHelpers;
import edu.mum.cs.cs425.fubc.fubcbankingapp.util.ViewLinkHelpers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class AccountTypeController {
    @Autowired
    private AccountTypeService service;

    @GetMapping(value = ControllerLinkHelpers.ACCOUNTTYPE_LIST_URL)
    public ModelAndView displayAccountTypeList(@RequestParam(defaultValue = "0") int pageNo) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accounttypes", service.getAccountTypeList(pageNo));
        modelAndView.addObject("currentPage", pageNo);
        modelAndView.addObject("page_links", ViewLinkHelpers.pageLinks);
        modelAndView.setViewName(ControllerLinkHelpers.ACCOUNTTYPE_LIST_VIEW);

        return modelAndView;
    }

    @GetMapping(value = ControllerLinkHelpers.ACCOUNTTYPE_ADD_URL)
    public String diplayAddNewccountType(Model model) {
        model.addAttribute("accounttype", new AccountType());
        model.addAttribute("page_links", ViewLinkHelpers.pageLinks);
        return  ControllerLinkHelpers.ACCOUNTTYPE_ADD_VIEW;
    }
}
