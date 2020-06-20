package com.springbootmysql.springbootdatajpamysql.resources;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmysql.springbootdatajpamysql.entity.Customer;
import com.springbootmysql.springbootdatajpamysql.exception.NotFoundException;
import com.springbootmysql.springbootdatajpamysql.repo.CustomerRepository;

@RestController
@RequestMapping("customer")
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerRepository repository;

	@PostConstruct
	public void init() {
		List<String> names = Arrays.asList("sriram", "sita");
		List<String> locations = Arrays.asList("ayodhya", "midhila");
		for (int i = 0; i < names.size(); i++) {
			repository.save(new Customer(names.get(i), locations.get(i)));
		}
	}

	@GetMapping
	public Iterable<Customer> getAll() {
		logger.info("getAll");
		return repository.findAll();
	}

	@GetMapping("{id}")
	public Customer getCustomer(@PathVariable Long id) {
		logger.info("getCustomer for {}", id);
		return repository.findById(id).orElseThrow(NotFoundException::new);
	}

}
