package com.rajbhar.rest.api.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.rajbhar.rest.api.entity.Customer;
import com.rajbhar.rest.api.exception.CustomerNotFoundExcetion;

@Repository
public class CustomerDao {

	static Map<Integer, Customer> map = new HashMap<>();

	static {
		initCustomers();
	}

	private static void initCustomers() {
		Customer customer = new Customer(100, "Raja", "Bangalore", 909090909, "Cashier");
		Customer customer1 = new Customer(200, "Rani", "Mangalore", 989898989, "Manager");
		Customer customer2 = new Customer(300, "Radhika", "Hyderbad", 979797979, "Clerk");

		map.put(customer.getId(), customer);
		map.put(customer1.getId(), customer1);
		map.put(customer2.getId(), customer2);
	}

	// for adding customer
	public List<Customer> addCustomer(Customer customer) {
		map.put(customer.getId(), customer);

		return getCustomers();
	}

	// for update customer details
	public List<Customer> updateCustomer(Customer customer) throws CustomerNotFoundExcetion {
		if (map.containsKey(customer.getId())) {
			map.put(customer.getId(), customer);
		} else {
			throw new CustomerNotFoundExcetion("Customer does not exits with id " + customer.getId());
		}

		return getCustomers();
	}

	// for search customer
	public Customer searchCustomer(int id) throws CustomerNotFoundExcetion {
		Customer tempCustomer;
		if (map.containsKey(id)) {
			tempCustomer = map.get(id);
		} else {
			throw new CustomerNotFoundExcetion("Customer does not exits with id " + id);
		}

		return tempCustomer;
	}

	// for delete customer
	public List<Customer> deleteCustomer(int id) throws CustomerNotFoundExcetion {
		if (map.containsKey(id)) {
			map.remove(id);
		} else {
			throw new CustomerNotFoundExcetion("Customer does not exits with id " + id);
		}

		return getCustomers();
	}

	// get List of customer
	private List<Customer> getCustomers() {
		List<Customer> list = new ArrayList<>();
		Collection<Customer> cust = map.values();
		list.addAll(cust);
		return list;
	}

}
