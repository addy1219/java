package com.example.demo.controller;

	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.validation.annotation.Validated;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

    import com.example.demo.exception.ResourceNotFoundException;
    import com.example.demo.model.Customer;
    import com.example.demo.repository.CustomerRepository;

	@RestController
	@RequestMapping("/api/v1/")
	public class CustomerController 
	{
		@Autowired
		CustomerRepository repo;
		
		@GetMapping("customers")
		public List<Customer> getAllCustomers()
		{
			return this.repo.findAll();
		}
		
		@GetMapping("/customer/{id}")
		public ResponseEntity<Customer> getCustomerById(@PathVariable(value="id") Integer id) throws ResourceNotFoundException
		{
			Customer customer = repo.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id : "+id));
							return ResponseEntity.ok().body(customer);
		}
		
		@PostMapping("customer")
		public Customer createCustomer(@RequestBody Customer customer)
		{
			return this.repo.save(customer);
		}
		
		@PutMapping("customer/{id}")
		public ResponseEntity<Customer> updateCustomer(@PathVariable(value="id") Integer id,
				@Validated @RequestBody Customer customerDetails) throws ResourceNotFoundException
		{
			Customer customer = repo.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id : "+id));
			customer.setFirstName(customerDetails.getFirstName());
			customer.setLastName(customerDetails.getLastName());
			customer.setDob(customerDetails.getDob());
			customer.setEmail(customerDetails.getEmail());
			customer.setAddress(customerDetails.getAddress());
			customer.setPhone(customerDetails.getPhone());
			
			return ResponseEntity.ok(this.repo.save(customer));
		}
		
		@DeleteMapping("customer/{id}")
		public Map<String,Boolean> deleteCustomer(@PathVariable(value="id") Integer id) throws ResourceNotFoundException
		{
			Customer customer = repo.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Customer not found for this id : "+id));
			
			this.repo.delete(customer);
			Map<String,Boolean> response = new HashMap<>();
			response.put("deleted",Boolean.TRUE);
			return response;
		}
}