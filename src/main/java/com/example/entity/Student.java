package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;

	@Column(name="rollno")
	private String rollno;
	
	@Column(name="university")
	private String university;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	Address address;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + ", university=" + university
				+ ", address=" + address + "]";
	}

	public Student(Long id, String name, String rollno, String university) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.university = university;
	}
	
	public Student(String name, String rollno, String university,Address address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.university = university;
		this.address = address;
	}
	
	public Student() {
		super();
	}
	
	
	

}
