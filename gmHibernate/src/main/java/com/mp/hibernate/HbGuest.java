package com.mp.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GUEST_T")
public class HbGuest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5662673983663573207L;
	@Id
	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "age")
	private int age;

	public HbGuest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "HbGuest [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}
