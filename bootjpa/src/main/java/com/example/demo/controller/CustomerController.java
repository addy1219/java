package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.CustomerRepo;
import com.example.demo.model.Customer;

@RestController
public class CustomerController 
{
	@Autowired
	CustomerRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@DeleteMapping("/customer/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		Customer customer = repo.getOne(id);
		repo.delete(customer);
		return "Deleted !";
	}
	
	@PutMapping("/customer")
	public Customer saveOrUpdateCustomer(@RequestBody Customer customer)
	{
		repo.save(customer);
		return customer;
	}
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		repo.save(customer);
		return customer;
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomers()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/customer/{id}")
	public Optional<Customer> getCustomer(@PathVariable("id") int id)
	{
		return repo.findById(id);
	}
}