package edu.mum.cs.cs425.fubc.fubcbankingapp.controller;

import edu.mum.cs.cs425.fubc.fubcbankingapp.model.Customer;
import edu.mum.cs.cs425.fubc.fubcbankingapp.service.CustomerService;
import edu.mum.cs.cs425.fubc.fubcbankingapp.util.ControllerLinkHelpers;
import edu.mum.cs.cs425.fubc.fubcbankingapp.util.ViewLinkHelpers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class CustomerController {
    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }


    @RequestMapping(value = ControllerLinkHelpers.CUSTOMER_LIST_URL)
    public ModelAndView displayCustomerList(@RequestParam(defaultValue = "0") int pageNo) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customers", service.getCustomersList(pageNo));
        modelAndView.addObject("currentPage", pageNo);
        modelAndView.addObject("page_links", ViewLinkHelpers.pageLinks);
        modelAndView.setViewName(ControllerLinkHelpers.CUSTOMER_LIST_VIEW);

        return modelAndView;
    }

    @RequestMapping(value = ControllerLinkHelpers.CUSTOMER_ADD_URL)
    public String displayAddNewCustomer(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("page_links", ViewLinkHelpers.pageLinks);
        return ControllerLinkHelpers.CUSTOMER_ADD_VIEW;
    }

    @PostMapping(value = ControllerLinkHelpers.CUSTOMER_ADD_URL)
    public String addNewCustomer(@Valid @ModelAttribute("customer") Customer customer,
                                 BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("page_links", ViewLinkHelpers.pageLinks);
            return  ControllerLinkHelpers.CUSTOMER_ADD_VIEW;
        } else {
            customer = service.saveCustomer(customer);
            return "redirect:" + ControllerLinkHelpers.CUSTOMER_LIST_URL;
        }
    }


}
