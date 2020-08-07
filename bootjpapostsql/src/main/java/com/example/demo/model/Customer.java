package com.example.demo.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="customers")
	public class Customer 
	{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int id;
		@Column(name="firstName")
		String firstName;
		@Column(name="lastName")
		String lastName;
		@Column(name="dob")
		int dob;
		@Column(name="email")
		String email;
		@Column(name="address")
		String address;
		@Column(name="phone")
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