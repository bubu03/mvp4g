package com.mvp4g.example.client.bean;

import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

public class UserBean implements IsSerializable {

	private String firstName = null;
	private String lastName = null;
	private String email = null;
	private String username = null;
	private String password = null;
	private String department = null;
	private List<String> roles = null;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName( String firstName ) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName( String lastName ) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail( String email ) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername( String username ) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword( String password ) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment( String department ) {
		this.department = department;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles( List<String> roles ) {
		this.roles = roles;
	}

	public void copy( UserBean user ) {

	}

	@Override
	public boolean equals(Object user){
		return user instanceof UserBean;
	}

}
