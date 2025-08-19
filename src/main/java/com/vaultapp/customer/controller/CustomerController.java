package com.vaultapp.customer.controller;

import com.vaultapp.customer.service.CustomerService;
import com.vaultapp.customer.dto.CustomerRequestDto;
import com.vaultapp.customer.entity.Customer;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/createCustomer")

    public Customer createCustomer(@RequestBody CustomerRequestDto dto) {
        return customerService.createCustomer(dto);
    }

    @GetMapping("/allCustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

}
