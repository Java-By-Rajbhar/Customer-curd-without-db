package com.rajbhar.rest.api.service;

import java.util.List;

import com.rajbhar.rest.api.entity.Customer;
import com.rajbhar.rest.api.exception.CustomerNotFoundExcetion;

public interface ICustomerService {

	public List<Customer> addCustomer(Customer customer);

	public List<Customer> updateCustomer(Customer customer) throws CustomerNotFoundExcetion;

	public Customer searchCustomer(int id) throws CustomerNotFoundExcetion;

	public List<Customer> deleteCustomer(int id) throws CustomerNotFoundExcetion;

}
