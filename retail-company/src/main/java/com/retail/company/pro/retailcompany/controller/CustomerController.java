package com.retail.company.pro.retailcompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.retail.company.pro.retailcompany.model.Customer;
import com.retail.company.pro.retailcompany.service.CustomerDao;
import java.io.IOException;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
	private CustomerDao custDao;

	@RequestMapping(value = "/fetch")
	public ModelAndView listCustomer(ModelAndView model) throws IOException {

		List<Customer> listCust = custDao.custList();
		model.addObject("listCust", listCust);
		model.setViewName("index");
		return model;
	}
}

