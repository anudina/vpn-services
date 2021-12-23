package com.anudina.org.siteservices;
import com.anudina.org.siteservices.services.Customer;
import com.anudina.org.siteservices.services.CustomerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerController {
    
    Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
	private CustomerRepository repository;

   @RequestMapping("/getAll")
    public String getSite(){
        StringBuffer buf = new StringBuffer();
        for (Customer customer : repository.findAll()) {
			System.out.println(buf.append(customer.firstName));
		}
        return buf.toString();
    }

    @RequestMapping("/getByName")
    public String getSite(String name){
        logger.info("getVPN() Called");
        return "VPN1";
    }
}