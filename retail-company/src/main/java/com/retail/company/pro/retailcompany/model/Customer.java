package com.retail.company.pro.retailcompany.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Customer {
	
	  @Id
	  private int id;
		private String name;
		private String address;
	  
	  public Customer() {
		  id = 0;
		  name = null;
		  address = null;;
	  }
	  
	  public Customer(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	  public int getId(){return id;}
	  public String getName(){return name;}
	  public String getAddress(){return address;}
	  public void setId(int id){this.id = id;}
	  public void setName(String name){this.name = name;}
	  public void setAddress(String address) {
			this.address = address;
		}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	    
}
