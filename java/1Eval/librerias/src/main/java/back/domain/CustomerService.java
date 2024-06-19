package back.domain;

import back.persistence.ControllerDao;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customerList = new ArrayList<>();
    private Customer customer;

    public List<Customer> findAll() {
        ControllerDao controllerRepository = new ControllerDao();
        customerList = controllerRepository.findAll();
        return customerList;
    }

    public Customer findById(int id) {
        ControllerDao controllerRepository = new ControllerDao();
        customer = controllerRepository.findById(id);
        return customer;
    }
}
