package com.dp.creational.builder;

import lombok.Data;

@Data
class User {
	int id;
	String name;
	int age;
	String address;

}

public class UserBuilder {

	User user;

	public UserBuilder() {
		this.user = new User();
	}

	UserBuilder addId(int id) {
		user.setId(id);
		return this;
	}

	UserBuilder addName(String name) {
		user.setName(name);
		return this;
	}

	UserBuilder addAge(int age) {
		user.setAge(age);
		return this;
	}

	UserBuilder addAddress(String address) {
		user.setAddress(address);
		return this;
	}
	
	@Override
	public String toString() {
		return this.user.toString();
	}
}
