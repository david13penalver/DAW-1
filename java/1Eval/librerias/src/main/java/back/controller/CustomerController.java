package back.controller;

import back.domain.Customer;
import back.domain.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private List<Customer> customerList = new ArrayList<>();
    private Customer customer;
    public List<Customer> findAll() {
        CustomerService customerService = new CustomerService();
        customerList = customerService.findAll();
        return customerList;
    }

    public Customer findById(int id) {
        CustomerService customerService = new CustomerService();
        customer = customerService.findById(id);
        return customer;
    }
}
