package com.quiz.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String  fname;
	private String lname;
	private String mailId;
	private String uname;
	private String pwd;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}



	public User(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}



	public User(int id, String fname, String lname, String mailId, String uname, String pwd) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mailId = mailId;
		this.uname = uname;
		this.pwd = pwd;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mailId=" + mailId + ", uname=" + uname
				+ ", pwd=" + pwd + "]";
	}

}
