package com.app.user;

public class User {
	private String seq;
	private String email;
	private String password;
	private String name;
	private String mobile;
	private String blogYn;
	
	public User() {}

	public User(String seq, String email, String password, String name, String mobile, String blogYn) {
		this.seq = seq;
		this.email = email;
		this.password = password;
		this.name = name;
		this.mobile = mobile;
		this.blogYn = blogYn;
	}

	public String getSeq() {
		return seq;
	}
	
	public void setSeq(String seq) {
		this.seq = seq;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getBlogYn() {
		return blogYn;
	}
	
	public void setBlogYn(String blogYn) {
		this.blogYn = blogYn;
	}
	
}
