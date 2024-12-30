package com.example.eclectics_kyc_app_api.controllers;

import com.example.eclectics_kyc_app_api.dto.CustomerRegistrationDTO;
import com.example.eclectics_kyc_app_api.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerRegistrationController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public CustomerRegistrationController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(@Valid @RequestBody CustomerRegistrationDTO dto) {
        Customer customer = customerService.registerCustomer(dto);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }
}
