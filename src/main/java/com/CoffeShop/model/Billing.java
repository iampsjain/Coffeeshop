package com.CoffeShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Billing {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	int id;

	@Column
	String payment_method;

	@Column
	long bill;

	@Column
	int customer_id;

	@Column
	int addressId;

	public Billing() {
		// TODO Auto-generated constructor stub
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public long getBill() {
		return bill;
	}

	public void setBill(long bill) {
		this.bill = bill;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

}
