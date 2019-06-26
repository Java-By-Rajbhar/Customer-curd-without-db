package com.rajbhar.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajbhar.rest.api.entity.Customer;
import com.rajbhar.rest.api.exception.CustomerNotFoundExcetion;
import com.rajbhar.rest.api.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerService;

	@PostMapping("/addCustomer")
	public List<Customer> addCustomer(@RequestBody Customer customer) {

		return customerService.addCustomer(customer);

	}

	@PutMapping("/updateCustomer")
	public List<Customer> updateCustomer(@RequestBody Customer customer) throws CustomerNotFoundExcetion {
		return customerService.updateCustomer(customer);
	}

	@GetMapping("/getCustomer/{id}")
	public Customer searchCustomerById(@PathVariable("id") int id) throws CustomerNotFoundExcetion {
		return customerService.searchCustomer(id);
	}

	@DeleteMapping("/deleteCustomer/{id}")
	public List<Customer> deleteCustomerById(@PathVariable("id") int id) throws CustomerNotFoundExcetion {
		return customerService.deleteCustomer(id);
	}
}
