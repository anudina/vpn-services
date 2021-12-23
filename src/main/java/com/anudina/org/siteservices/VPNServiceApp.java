package com.anudina.org.siteservices;

import com.anudina.org.siteservices.services.Customer;
import com.anudina.org.siteservices.services.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VPNServiceApp implements CommandLineRunner {
	@Autowired
	private CustomerRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(VPNServiceApp.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();

		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));
		repository.save(new Customer("Anand", "Badiger"));
		repository.save(new Customer("Anu", "Badiger"));
		
	}

	

}
