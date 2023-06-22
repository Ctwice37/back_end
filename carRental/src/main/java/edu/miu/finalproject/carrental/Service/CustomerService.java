package edu.miu.finalproject.carrental.Service;

import edu.miu.finalproject.carrental.Model.Customer;
import org.springframework.data.domain.Page;

public interface CustomerService {

    Customer createCustomer(Customer customer);
    Page<Customer> getCustomers(int pageNumber, int pageSize);
}
