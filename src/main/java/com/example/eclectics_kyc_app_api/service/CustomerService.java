package com.example.eclectics_kyc_app_api.service;

import com.example.eclectics_kyc_app_api.dto.CustomerRegistrationDTO;
import com.example.eclectics_kyc_app_api.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer registerCustomer(CustomerRegistrationDTO dto) {
        Customer customer = new Customer();
        customer.setPhone(dto.getPhone());
        customer.setFirstName(dto.getFirstName());
        customer.setMiddleName(dto.getMiddleName());
        customer.setLastName(dto.getLastName());
        customer.setIdNumber(dto.getIdNumber());
        customer.setEmail(dto.getEmail());
        customer.setAddress(dto.getAddress());
        customer.setPassportPic(dto.getPassportPic());
        customer.setFrontIdPic(dto.getFrontIdPic());
        customer.setBackIdPic(dto.getBackIdPic());

        return customerRepository.save(customer);
    }
}
