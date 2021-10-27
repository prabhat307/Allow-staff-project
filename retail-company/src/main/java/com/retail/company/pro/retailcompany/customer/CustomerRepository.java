package com.retail.company.pro.retailcompany.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import com.retail.company.pro.retailcompany.model.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

	List<Customer> getAll();
	
}

