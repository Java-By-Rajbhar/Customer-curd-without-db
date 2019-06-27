package com.rajbhar.rest.api.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.rajbhar.rest.api.entity.Customer;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceImplTest {
	@InjectMocks
	CustomerServiceImpl customerServiceImpl;
	@Test
	public void addCustomerTest()
	{
		Customer customer =  new Customer(100, "raja", "Jaunpur", 9090900, "Manager");
		List<Customer> list = customerServiceImpl.addCustomer(customer);
		assertEquals(3, list.size());
	}

}
