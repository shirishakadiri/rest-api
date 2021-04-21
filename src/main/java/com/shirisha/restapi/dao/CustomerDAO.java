package com.shirisha.restapi.dao;

import com.shirisha.restapi.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Data Access Object
@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {
}
