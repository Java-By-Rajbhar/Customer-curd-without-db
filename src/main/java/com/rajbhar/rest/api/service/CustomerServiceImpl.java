package com.rajbhar.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajbhar.rest.api.dao.CustomerDao;
import com.rajbhar.rest.api.entity.Customer;
import com.rajbhar.rest.api.exception.CustomerNotFoundExcetion;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	CustomerDao customerDao;

	@Override
	public List<Customer> addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(customer);
	}

	@Override
	public List<Customer> updateCustomer(Customer customer) throws CustomerNotFoundExcetion {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

	@Override
	public Customer searchCustomer(int id) throws CustomerNotFoundExcetion {
		// TODO Auto-generated method stub
		return customerDao.searchCustomer(id);
	}

	@Override
	public List<Customer> deleteCustomer(int id) throws CustomerNotFoundExcetion {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomer(id);
	}

}
