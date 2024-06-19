package back.persistence;

import back.domain.Customer;

import java.util.List;

public class ControllerDao {
    private List<Customer> customerList = List.of(
            new Customer(1, "David", "123456789A"),
            new Customer(2, "Gabi", "234567890B"),
            new Customer(3, "Toni", "345678901C"),
            new Customer(4, "Borja", "456789012D")
    );
    public List<Customer> findAll() {
        return customerList;
    }

    public Customer findById(int id) {
        for (Customer customer : customerList) {
            if (id == customer.getId()) {
                return customer;
            }
        }
        return null;
    }
}
