package edu.miu.finalproject.carrental.Service.ServiceImpl;


import edu.miu.finalproject.carrental.Model.Customer;
import edu.miu.finalproject.carrental.Model.Rental;

import edu.miu.finalproject.carrental.Repository.CustomerRepository;
import edu.miu.finalproject.carrental.Service.CustomerService;
import edu.miu.finalproject.carrental.Service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Page<Customer> getCustomers(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return customerRepository.findAll(pageable);
    }



}
