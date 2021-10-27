package com.retail.company.pro.retailcompany.service;

import com.retail.company.pro.retailcompany.model.Customer;

import java.util.List;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CustomerService implements CustomerDao {
	private JdbcTemplate jdbcTemp;
	public CustomerService(DataSource dataSource) {
		jdbcTemp = new JdbcTemplate(dataSource);
	}
	@Override
	public List<Customer> custList() {
		List<Customer> list = jdbcTemp.query("SELECT * FROM CUST_DETAILS", new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer cust = new Customer();
				cust.setName(rs.getString("name"));
				cust.setAddress(rs.getString("address"));
				return cust;
			}
		});
		return list;
	}
}
