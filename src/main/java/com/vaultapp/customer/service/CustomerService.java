package com.vaultapp.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaultapp.customer.dto.CustomerRequestDto;
import com.vaultapp.customer.entity.Customer;
import com.vaultapp.customer.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(CustomerRequestDto dto) {

        Customer customer = new Customer();

        customer.setCust_name(dto.getCust_name());
        customer.setCust_role(dto.getCust_role());

        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}
