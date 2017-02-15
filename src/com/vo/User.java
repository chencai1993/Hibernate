package com.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "test")
public class User implements java.io.Serializable {

	// Fields

	private String username;
	private String password;
	private String realname;
	private Integer type;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String password, Integer type) {
		this.password = password;
		this.type = type;
	}

	/** full constructor */
	public User(String password, String realname, Integer type) {
		this.password = password;
		this.realname = realname;
		this.type = type;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "username", unique = true, nullable = false, length = 30)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 30)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "realname", length = 11)
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(name = "type", nullable = false)
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}