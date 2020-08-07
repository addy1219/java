package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	int id;
	String firstName;
	String lastName;
	int dob;
	String email;
	String address;
	long phone;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public int getDob() 
	{
		return dob;
	}
	public void setDob(int dob) 
	{
		this.dob = dob;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public long getPhone()
	{
		return phone;	
	}
	public void setPhone(long phone) 
	{
		this.phone = phone;
	}
	@Override
	public String toString() 
	{
		return "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", email=" + email
				+ ", address=" + address + ", phone=" + phone;
	}
}