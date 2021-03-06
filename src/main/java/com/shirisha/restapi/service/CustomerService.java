package com.shirisha.restapi.service;

import com.shirisha.restapi.dao.CustomerDAO;
import com.shirisha.restapi.exception.CustomerNotFoundException;
import com.shirisha.restapi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    private int customerIdCount = 1;
    private List<Customer> customerList = new CopyOnWriteArrayList<>();

    public Customer addCustomer(Customer customer){
        /*
        customer.setCustomerId(customerIdCount);
        customerList.add(customer);
        customerIdCount++;
         */
         return customerDAO.save(customer);
        //return customer;
    }

    public List<Customer> getCustomerList(){
        return customerDAO.findAll();
        //return customerList;
    }

    public Customer getCustomer(int customerId){

        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);

        if(!optionalCustomer.isPresent())
            throw new CustomerNotFoundException("Customer record not available");

        return optionalCustomer.get();
        /*
        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();

         */
    }

    public Customer updateCustomer(int customerId, Customer customer){
        /*
        customerList
                .stream()
                .forEach(c -> {
                    if(c.getCustomerId() == customerId){
                        c.setCustomerFirstName(customer.getCustomerFirstName());
                        c.setCustomerLastName(customer.getCustomerLastName());
                        c.setCustomerEmail(customer.getCustomerEmail());
                    }
                });

        return customerList
                .stream()
                .filter(c -> c.getCustomerId() == customerId)
                .findFirst()
                .get();

         */

        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId){
        /*
        customerList
                .stream()
                .forEach(c -> {
                    if(c.getCustomerId() == customerId){
                        customerList.remove(c);
                    }
                });

         */

        customerDAO.deleteById(customerId);
    }
}
